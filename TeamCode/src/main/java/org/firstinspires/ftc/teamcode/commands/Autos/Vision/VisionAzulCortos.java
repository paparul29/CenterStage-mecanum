package org.firstinspires.ftc.teamcode.commands.Autos.Vision;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.CommandScheduler;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.teamcode.commands.Autos.AzulDer;
import org.firstinspires.ftc.teamcode.commands.Autos.AzulIzq;
import org.firstinspires.ftc.teamcode.commands.Autos.AzulMid;
import org.firstinspires.ftc.teamcode.commands.Autos.AzulesBuenosDer;
import org.firstinspires.ftc.teamcode.commands.Autos.AzulesBuenosIzq;
import org.firstinspires.ftc.teamcode.commands.Autos.AzulesBuenosMid;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.Elevator;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.PixelHolder;
import org.opencv.core.*;
import org.opencv.imgproc.Imgproc;
import org.opencv.imgproc.Moments;
import org.openftc.easyopencv.OpenCvCamera;
import org.openftc.easyopencv.OpenCvCameraFactory;
import org.openftc.easyopencv.OpenCvCameraRotation;
import org.openftc.easyopencv.OpenCvPipeline;

import java.util.ArrayList;
import java.util.List;

@Autonomous
public class VisionAzulCortos extends CommandOpMode {

    double cX = 0;
    double cY = 0;
    double width = 0;

    private OpenCvCamera controlHubCam;  // Use OpenCvCamera class from FTC SDK
    private static final int CAMERA_WIDTH = 720; // width  of wanted camera resolution
    private static final int CAMERA_HEIGHT = 480; // height of wanted camera resolution

    // Calculate the distance using the formula
    public static final double objectWidthInRealWorldUnits = 3.75;  // Replace with the actual width of the object in real-world units
    public static final double focalLength = 728;  // Replace with the focal length of the camera in pixels
    Intake intake;
    Elevator elevator;
    PixelHolder pixelHolder;
    SampleMecanumDrive sampleMecanumDrive;
    MecanumDriveSubsystem drive;

    @Override
    public void initialize() {
        initOpenCV();
        FtcDashboard dashboard = FtcDashboard.getInstance();
        telemetry = new MultipleTelemetry(telemetry, dashboard.getTelemetry());
        FtcDashboard.getInstance().startCameraStream(controlHubCam, 30);
        sampleMecanumDrive = new SampleMecanumDrive(hardwareMap);
        drive = new MecanumDriveSubsystem(sampleMecanumDrive, false, false);
        intake = new Intake(telemetry, hardwareMap);
        elevator = new Elevator(telemetry, hardwareMap);
        pixelHolder = new PixelHolder(hardwareMap, telemetry);

        sleep(400);

        while(!isStarted()){
            telemetry.addData("Coordinate", "(" + (int) cX + ", " + (int) cY + ")");
            if (getDistance(width) < 100) {
                if (cX < 400 && cX > 1) {
                    telemetry.addLine("A la izquierda");
                    CommandScheduler.getInstance().schedule(new AzulesBuenosIzq(drive,elevator,intake,pixelHolder));
                }
                else if (cX > 400 && cX < 650) {
                    telemetry.addLine("En medio");
                    CommandScheduler.getInstance().schedule(new AzulesBuenosMid(drive, elevator, intake, pixelHolder));
                }
            }
            else{
                    telemetry.addLine("Lado derecho");
                    CommandScheduler.getInstance().schedule(new AzulesBuenosDer(drive, elevator, intake, pixelHolder));
                }

            telemetry.update();
        }
        telemetry.update();

        waitForStart();
        telemetry.addData("Coordinate", "(" + (int) cX + ", " + (int) cY + ")");
        telemetry.addData("Distance in Inch", (getDistance(width)));
        telemetry.update();

            if (cX < 400 && cX > 1) {
                CommandScheduler.getInstance().schedule(new AzulesBuenosIzq(drive, elevator, intake, pixelHolder));
            }else if(cX > 400 && cX < 650) {
                CommandScheduler.getInstance().schedule(new AzulesBuenosMid(drive, elevator, intake, pixelHolder));
            }else{
                CommandScheduler.getInstance().schedule(new AzulesBuenosDer(drive, elevator, intake, pixelHolder));
            }





        controlHubCam.stopStreaming();
    }

    private void initOpenCV() {

        int cameraMonitorViewId = hardwareMap.appContext.getResources().getIdentifier(
                "cameraMonitorViewId", "id", hardwareMap.appContext.getPackageName());

        controlHubCam = OpenCvCameraFactory.getInstance().createWebcam(
                hardwareMap.get(WebcamName.class, "camara1"), cameraMonitorViewId);

        controlHubCam.setPipeline(new BlobDetectionPipeline());

        controlHubCam.openCameraDevice();
        controlHubCam.startStreaming(CAMERA_WIDTH, CAMERA_HEIGHT, OpenCvCameraRotation.UPRIGHT);
    }
    class BlobDetectionPipeline extends OpenCvPipeline {
        Mat blueMask;
        Mat hierarchy = new Mat();
        @Override
        public Mat processFrame(Mat input) {
            blueMask = preprocessFrame(input);
            // Preprocess the frame to detect blue regions
            // Find contours of the detected blue regions
            List<MatOfPoint> contours = new ArrayList<>();
            Imgproc.findContours(blueMask, contours, hierarchy, Imgproc.RETR_EXTERNAL, Imgproc.CHAIN_APPROX_SIMPLE);

            // Find the largest blue contour (blob)
            MatOfPoint largestContour = findLargestContour(contours);

            if (largestContour != null) {
                // Draw a blue outline around the largest detected object
                Imgproc.drawContours(input, contours, contours.indexOf(largestContour), new Scalar(255, 0, 0), 2);
                // Calculate the width of the bounding box
                width = calculateWidth(largestContour);

                // Display the width next to the label
                String widthLabel = "Width: " + (int) width + " pixels";
                Imgproc.putText(input, widthLabel, new Point(cX + 10, cY + 20), Imgproc.FONT_HERSHEY_SIMPLEX, 0.5, new Scalar(0, 255, 0), 2);
                //Display the Distance
                String distanceLabel = "Distance: " + String.format("%.2f", getDistance(width)) + " inches";
                Imgproc.putText(input, distanceLabel, new Point(cX + 10, cY + 60), Imgproc.FONT_HERSHEY_SIMPLEX, 0.5, new Scalar(0, 255, 0), 2);
                // Calculate the centroid of the largest contour
                Moments moments = Imgproc.moments(largestContour);
                cX = moments.get_m10() / moments.get_m00();
                cY = moments.get_m01() / moments.get_m00();




                // Draw a dot at the centroid
                String label = "(" + (int) cX + ", " + (int) cY + ")";
                Imgproc.putText(input, label, new Point(cX + 10, cY), Imgproc.FONT_HERSHEY_COMPLEX, 0.5, new Scalar(0, 255, 0), 2);
                Imgproc.circle(input, new Point(cX, cY), 5, new Scalar(0, 255, 0), -1);

            }
            return input;
        }
        Mat hsvFrame = new Mat();
        private Mat preprocessFrame(Mat frame) {
            Imgproc.cvtColor(frame, hsvFrame, Imgproc.COLOR_BGR2HSV);

            Scalar lowerblue = new Scalar(0, 100, 0);
            Scalar upperblue = new Scalar(60, 255, 170);


            blueMask = new Mat();
            Core.inRange(hsvFrame, lowerblue, upperblue, blueMask);

            Mat kernel = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new Size(5, 5));
            Imgproc.morphologyEx(blueMask, blueMask, Imgproc.MORPH_OPEN, kernel);
            Imgproc.morphologyEx(blueMask, blueMask, Imgproc.MORPH_CLOSE, kernel);

            return blueMask;
        }

        private MatOfPoint findLargestContour(List<MatOfPoint> contours) {
            double maxArea = 0;
            MatOfPoint largestContour = null;

            for (MatOfPoint contour : contours) {
                double area = Imgproc.contourArea(contour);
                if (area > maxArea) {
                    maxArea = area;
                    largestContour = contour;
                }
            }

            return largestContour;
        }
        private double calculateWidth(MatOfPoint contour) {
            Rect boundingRect = Imgproc.boundingRect(contour);
            return boundingRect.width;
        }

    }
    private static double getDistance(double width){
        double distance = (objectWidthInRealWorldUnits * focalLength) / width;
        return distance;
    }


}