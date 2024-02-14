package org.firstinspires.ftc.teamcode.Trayectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class RojosBuenos {

    public Trajectory rojoMidB1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(12, -61, Math.toRadians(90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineToLinearHeading(new Pose2d(12, -33.38, Math.toRadians(90)))
                .build();
    }

    public Trajectory rojoMidB1ymedio(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(12, -33.38, Math.toRadians(90))), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(47, -34.3, Math.toRadians(0)))
                .build();
    }

    public Trajectory rojoMidB2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(47, -34.3, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(53.2, -34.5, Math.toRadians(0)))
                .build();
    }
    public Trajectory rojoMidB2ymedio(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(53.2, -34.5, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(45, -34.5, Math.toRadians(0)))
                .build();
    }

    public Trajectory rojoMidB3(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(45, -34.5, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(40, -8.9, Math.toRadians(180)))
                .build();
    }
    public Trajectory rojoMidB4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(40, -8.9, Math.toRadians(180))), Math.toRadians(1800))
                .lineToLinearHeading(new Pose2d(-57.9, -10, Math.toRadians(180)))
                .build();
    }
    public Trajectory rojoMidB5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(-57.9, -10, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(-43.55, 1.11, Math.toRadians(0)))
                .build();
    }
    public Trajectory rojoMidB6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(-43.55, 1.11, Math.toRadians(0))), Math.toRadians(0))
                .splineTo(new Vector2d(16.05, -6.99), Math.toRadians(-21.54))
                .splineTo(new Vector2d(48, -36.08), Math.toRadians(0))
                .build();
    }

    public Trajectory rojoMidB6ymedio(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(48, -36.08, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(53, -36.08, Math.toRadians(0)))
                .build();
    }
    public Trajectory rojoMidB7(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(53, -36.08, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(45, -36.08, Math.toRadians(0)))
                .build();
    }




    //IZQ

    public Trajectory rojoIzqB1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(12, -61, Math.toRadians(90));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .splineTo(new Vector2d(8, -36), Math.toRadians(115))
                .build();
    }
    public Trajectory rojoIzqB1ymedio(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(8, -36, Math.toRadians(115))), Math.toRadians(115))
                .lineToLinearHeading(new Pose2d(48, -27, Math.toRadians(0)))
                .build();
    }
    public Trajectory rojoIzqB2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(48, -27, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(52.5, -27, Math.toRadians(0)))
                .build();
    }
    public Trajectory rojoIzqB2ymedio(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(52.5, -27, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(47, -27, Math.toRadians(0)))
                .build();
    }
    public Trajectory rojoIzqB3(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(47, -27, Math.toRadians(180))), Math.toRadians(180))
                .lineToLinearHeading(new Pose2d(40, -8.9, Math.toRadians(180)))
                .build();
    }
    public Trajectory rojoIzqB4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(40, -8.9, Math.toRadians(180))), Math.toRadians(180))
                .lineToLinearHeading(new Pose2d(-54.5, -11.7, Math.toRadians(180)))
                .build();
    }
    public Trajectory rojoIzqB5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(-54.5, -11.7, Math.toRadians(0))), Math.toRadians(180))
                .lineToLinearHeading(new Pose2d(-43.55, 1.11, Math.toRadians(0)))
                .build();
    }

    public Trajectory rojoIzqB6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(-43.5, 1.11, Math.toRadians(0))), Math.toRadians(0))
                .splineTo(new Vector2d(16.58, -12), Math.toRadians(-21.62))
                .splineTo(new Vector2d(47, -38), Math.toRadians(0))
                .build();
    }
    public Trajectory rojoIzqB6ymedio(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(47, -38, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(52, -38, Math.toRadians(0)))
                .build();
    }
    public Trajectory rojoIzqB7(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(52, -38, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(47, -38, Math.toRadians(0)))
                .build();
    }



    public Trajectory rojoDerB1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(12, -61, Math.toRadians(90));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineToLinearHeading(new Pose2d(21.63, -40, Math.toRadians(60)))
                .build();
    }
    public Trajectory rojoDerB1yUnCuarto(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(21.63, -40, Math.toRadians(60))), Math.toRadians(60))
                .lineToLinearHeading(new Pose2d(41, -50, Math.toRadians(0)))
                .build();
    }

    public Trajectory rojoDerB2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(41, -50, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(53.3, -40, Math.toRadians(0)))
                .build();
    }
    public Trajectory rojoDerB2ymedio(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(53.3, -40, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(46, -40, Math.toRadians(0)))
                .build();
    }
    public Trajectory rojoDerB3(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(46, -40, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(40, -8.90, Math.toRadians(180)))
                    .build();
    }
    public Trajectory rojoDerB4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(40, -8.9, Math.toRadians(180))), Math.toRadians(180))
                .lineToLinearHeading(new Pose2d(-56.7, -10.9, Math.toRadians(180)))
                .build();
    }
    public Trajectory rojoDerB5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(-56.7, -10.9, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(-43.55, 1.11, Math.toRadians(0)))
                .build();
    }
    public Trajectory rojoDerB6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(-43.55, 1.11, Math.toRadians(0))), Math.toRadians(0))
                .splineTo(new Vector2d(25.74, -13.42), Math.toRadians(-16.37))
                .splineTo(new Vector2d(47, -34), Math.toRadians(0))
                .build();
    }
    public Trajectory rojoDerB6ymedio(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(47, -34, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(53, -34, Math.toRadians(0)))
                .build();
    }
    public Trajectory rojoDerB7(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(53, -34, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(47, -34, Math.toRadians(0)))
                .build();
    }
}