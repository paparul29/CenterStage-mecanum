package org.firstinspires.ftc.teamcode.Trayectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.Intake;

import java.util.logging.Handler;

public class AutosRojos {

    public Trajectory rojoMedio1(SampleMecanumDrive drive){
        Pose2d firstPose = new Pose2d(6, -56.4, Math.toRadians(89));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .splineToSplineHeading(new Pose2d(6, -36, Math.toRadians(84)), Math.toRadians(84))
                .build();
    }
    public Trajectory rojoMedio2(SampleMecanumDrive drive){
        return  drive.trajectoryBuilder(new Pose2d(6, -36, Math.toRadians(84)), Math.toRadians(84))
                .splineToSplineHeading(new Pose2d(6, -39.2, Math.toRadians(90)), Math.toRadians(90))
                .build();
    }
    public Trajectory rojoMedio3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(6, -39.2, Math.toRadians(90)), Math.toRadians(90))
                .splineToSplineHeading(new Pose2d(42, -29, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory rojoMedio4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(42,-29, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(47,-29, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory rojoMedio5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(47, -29, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(43.6, -63.6, Math.toRadians(90)), Math.toRadians(90))
                .build();
    }

    public Trajectory rojoDer1(SampleMecanumDrive drive){
        Pose2d firstPose = new Pose2d(6, -56.4, Math.toRadians(89));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(new Pose2d(6, -56.4, Math.toRadians(89)), Math.toRadians(90))
                .splineToSplineHeading(new Pose2d(10,-38.4, Math.toRadians(40)), Math.toRadians(40))
                .build();
    }
    public Trajectory rojoDer2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(10, -38.4, Math.toRadians(40)), Math.toRadians(40))
                .splineToSplineHeading(new Pose2d(6,-38.4, Math.toRadians(40)), Math.toRadians(40))
                .build();
    }
    public Trajectory rojoDer3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(6, -38.4, Math.toRadians(40)), Math.toRadians(40))
                .splineToSplineHeading(new Pose2d(39,-38, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory rojoDer4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(39,-38, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(43,-33, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory rojoDer5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(43, -33, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(43.6, -63.6, Math.toRadians(90)), Math.toRadians(90))
                .build();
    }
//Trajectory traj = mysteryRobot.drive.trajectoryBuilder(new Pose2d(6,-57.6, Math.toRadians(90)), Math.toRadians(90))
// .splineToSplineHeading(new Pose2d(13.2,-34, Math.toRadians(51)), Math.toRadians(51))
// .splineToSplineHeading(new Pose2d(12.8,-51.2, Math.toRadians(91)), Math.toRadians(91))
// .splineToSplineHeading(new Pose2d(45.6,-42, Math.toRadians(-1)), Math.toRadians(-1))
// .splineToSplineHeading(new Pose2d(34.8,-40.4, Math.toRadians(0)), Math.toRadians(0))
// .splineToSplineHeading(new Pose2d(40,-62.4, Math.toRadians(92)), Math.toRadians(92))

    public Trajectory rojoIzq1(SampleMecanumDrive drive){
        Pose2d firstPose = new Pose2d(6, -56.4, Math.toRadians(89));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(new Pose2d(6, -56.4, Math.toRadians(89)), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(6, -36.4, Math.toRadians(120)))
                .build();
    }
    public Trajectory rojoIzq2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder((new Pose2d(6, -36.4, Math.toRadians(120))), Math.toRadians(120))
                .lineToLinearHeading(new Pose2d(7, -48, Math.toRadians(89)))
                .build();
    }
    public Trajectory rojoIzq3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder((new Pose2d(7, -48, Math.toRadians(89))), Math.toRadians(89))
                .splineToSplineHeading(new Pose2d(42, -22.7, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory rojoIzq4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(44, -22.7, Math.toRadians(0)),Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(46.5,-22.7, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory rojoIzq5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(46.5, -22.7, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(35,-22.7))
                .build();
    }
    public Trajectory rojoIzq6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(35, -22.7, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(47, -55))
                .build();
    }

    }
