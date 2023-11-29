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

    public Trajectory rojoMid1(SampleMecanumDrive drive){
        Pose2d firstPose = new Pose2d(6, -56.4, Math.toRadians(89));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(new Pose2d(6, -58, Math.toRadians(89)), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(6, -34, Math.toRadians(90)))
                .build();
    }
    public Trajectory rojoMid2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder((new Pose2d(6, -34, Math.toRadians(90))), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(6, -49, Math.toRadians(90)))
                .build();
    }
    public Trajectory rojoMid3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder((new Pose2d(6, -49, Math.toRadians(90))), Math.toRadians(90))
                .splineToSplineHeading(new Pose2d(42, -30.5, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory rojoMid4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(42, -30.5, Math.toRadians(0)),Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(47,-30.5, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory rojoMid5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(47, -30.5, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(35,-26.5))
                .build();
    }
    public Trajectory rojoMid6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(35, -26.5, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(47, -60))
                .build();
    }



    public Trajectory rojoDer1(SampleMecanumDrive drive){
        Pose2d firstPose = new Pose2d(6, -56.4, Math.toRadians(89));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(new Pose2d(6, -56.4, Math.toRadians(89)), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(6, -36.4, Math.toRadians(40)))
                .build();
    }
    public Trajectory rojoDer2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder((new Pose2d(6, -36.4, Math.toRadians(40))), Math.toRadians(40))
                .lineToLinearHeading(new Pose2d(10, -57, Math.toRadians(90)))
                .build();
    }
    public Trajectory rojoDer3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder((new Pose2d(10, -57, Math.toRadians(90))), Math.toRadians(90))
                .splineToSplineHeading(new Pose2d(42, -39, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory rojoDer4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(42, -39, Math.toRadians(0)),Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(47,-39, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory rojoDer5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(47, -39, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(35,-35))
                .build();
    }
    public Trajectory rojoDer6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(35, -35, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(44, -59))
                .build();
    }





    public Trajectory rojoIzq1(SampleMecanumDrive drive){
        Pose2d firstPose = new Pose2d(7, -56.4, Math.toRadians(89));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(new Pose2d(7, -56.4, Math.toRadians(89)), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(5, -36.4, Math.toRadians(123)))
                .build();
    }
    public Trajectory rojoIzq2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder((new Pose2d(6, -36.4, Math.toRadians(123))), Math.toRadians(123))
                .lineToLinearHeading(new Pose2d(7, -52, Math.toRadians(89)))
                .build();
    }
    public Trajectory rojoIzq3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder((new Pose2d(7, -52, Math.toRadians(89))), Math.toRadians(89))
                .splineToSplineHeading(new Pose2d(42, -25, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory rojoIzq4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(42, -25, Math.toRadians(0)),Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(46.5,-25, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory rojoIzq5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(46.5, -25, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(35,-25))
                .build();
    }
    public Trajectory rojoIzq6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(35, -20, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(47, -60))
                .build();
    }

    }
