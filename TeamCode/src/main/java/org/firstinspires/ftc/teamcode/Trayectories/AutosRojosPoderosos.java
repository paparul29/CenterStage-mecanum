package org.firstinspires.ftc.teamcode.Trayectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.Intake;

import java.util.logging.Handler;

public class AutosRojosPoderosos {

    //CORTOS
    public Trajectory rojoMid1LRG(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(6, -56.4, Math.toRadians(89));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(new Pose2d(6, -58, Math.toRadians(89)), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(9, -30, Math.toRadians(90)))
                .build();
    }

    public Trajectory rojoMid2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(6, -30, Math.toRadians(90))), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(6, -49, Math.toRadians(90)))
                .build();
    }

    public Trajectory rojoMid3(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(6, -49, Math.toRadians(90))), Math.toRadians(90))
                .splineToSplineHeading(new Pose2d(42, -31, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory rojoMid4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(42, -31, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(47, -31, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory rojoMid5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(47, -31, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(35, -26.5))
                .build();
    }

    public Trajectory rojoMid6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(35, -26.5, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(47, -60))
                .build();
    }


    public Trajectory rojoDer1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(6, -56.4, Math.toRadians(89));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(new Pose2d(6, -56.4, Math.toRadians(89)), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(6, -42, Math.toRadians(40)))
                .build();
    }

    public Trajectory rojoDer2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(6, -42, Math.toRadians(40))), Math.toRadians(40))
                .lineToLinearHeading(new Pose2d(30, -60, Math.toRadians(90)))
                .build();
    }

    public Trajectory rojoDer3(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(30, -60, Math.toRadians(90))), Math.toRadians(90))
                .splineToSplineHeading(new Pose2d(42, -39, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory rojoDer4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(42, -39, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(47, -39, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory rojoDer5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(47, -39, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(35, -35))
                .build();
    }

    public Trajectory rojoDer6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(35, -35, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(44, -59))
                .build();
    }


    public Trajectory rojoIzq1LRG(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(7, -56.4, Math.toRadians(89));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(new Pose2d(7, -56.4, Math.toRadians(89)), Math.toRadians(90))
                .lineTo(new Vector2d(15, -54))
                .build();
    }

    public Trajectory rojoIzq1yMedioLRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(15, -54, Math.toRadians(90)), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(42, -25, Math.toRadians(0)))
                .build();
    }

    public Trajectory rojoIzq2LRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(42, -25, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(46.5, -25, Math.toRadians(0)))
                .build();
    }

    public Trajectory rojoIzq3LRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(46.5, -25, Math.toRadians(0))), Math.toRadians(0))
                .splineToSplineHeading((new Pose2d(-40, -31, Math.toRadians(0))),Math.toRadians(0))
                .splineToSplineHeading((new Pose2d(-60,-31, Math.toRadians(180))),Math.toRadians(180))
                .build();
    }
    public Trajectory rojoIzq4LRG(SampleMecanumDrive drive){
        return drive.trajectoryBuilder((new Pose2d(-60,-31, Math.toRadians(180))), Math.toRadians(180))
                .splineToSplineHeading((new Pose2d(35, -31, Math.toRadians(180))),Math.toRadians(180))
                .splineToSplineHeading((new Pose2d(47,-25, Math.toRadians(0))),Math.toRadians(0))
                .build();
    }


}
//ida
//Trajectory traj = mysteryRobot.drive.trajectoryBuilder(new Pose2d(44.4,-34.4, Math.toRadians(-90)), Math.toRadians(-90))
//.splineToSplineHeading(new Pose2d(1.6,-53.2, Math.toRadians(-90)), Math.toRadians(-90))
//.splineToSplineHeading(new Pose2d(-26.8,-56.8, Math.toRadians(-90)), Math.toRadians(-90))
//.splineToSplineHeading(new Pose2d(-58.8,-37.2, Math.toRadians(-90)), Math.toRadians(-90))

//Trajectory traj = mysteryRobot.drive.trajectoryBuilder(new Pose2d(-58.8,-36.8, Math.toRadians(-90)), Math.toRadians(-90))
//.splineToSplineHeading(new Pose2d(-16.8,-12.8, Math.toRadians(-90)), Math.toRadians(-90))
//.splineToSplineHeading(new Pose2d(2.4,-12.8, Math.toRadians(-90)), Math.toRadians(-90))
//.splineToSplineHeading(new Pose2d(51.2,-57.6, Math.toRadians(-90)), Math.toRadians(-90))