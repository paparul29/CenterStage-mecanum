package org.firstinspires.ftc.teamcode.Trayectories;


import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class AutosAzules {

    //CORTOS
    public Trajectory azulMedio1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(6, 50.4, Math.toRadians(-90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineToLinearHeading(new Pose2d(8.8, 26, Math.toRadians(-90)))
                .build();
    }

    public Trajectory azulMedio2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(8.8, 26, Math.toRadians(-90)), Math.toRadians(-90))
                .back(20)
                .build();
    }

    public Trajectory azulMedio3(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(6, 46, Math.toRadians(-90)), Math.toRadians(-90))
                .splineToSplineHeading(new Pose2d(42, 25, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory azulMedio4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(42, 25, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(47, 25, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory azulMedio5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(47, 26, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(35,26))
                .build();
    }
    public Trajectory azulMedio6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(35, 26, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(43, 55))
                .build();
    }




    public Trajectory azulDer1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(8, 50.4, Math.toRadians(-90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineTo(new Vector2d(15,34))
                .build();
    }
    public Trajectory azulDer1yMedio(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(15,34, Math.toRadians(-90)), Math.toRadians(-90))
                .lineToLinearHeading(new Pose2d(5,33, Math.toRadians(-145)))
                .build();
    }

    public Trajectory azulDer2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(5, 32, Math.toRadians(-145)), Math.toRadians(-145))
                .lineToLinearHeading(new Pose2d(25, 50, Math.toRadians(-90)))
                .build();
    }

    public Trajectory azulDer3(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(25, 50, Math.toRadians(-90)), Math.toRadians(-90))
                .splineToSplineHeading(new Pose2d(42, 19, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory azulDer4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(42, 19, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(50.3, 19, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory azulDer5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(50.3, 20, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(35,24))
                .build();
    }
    public Trajectory azulDer6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(35, 24, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(43, 55))
                .build();
    }



    public Trajectory azulIzq1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(6, 50.4, Math.toRadians(-90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineToLinearHeading(new Pose2d(7.5, 31, Math.toRadians(-40)))
                .build();
    }

    public Trajectory azulIzq2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(7.5, 31, Math.toRadians(-40)), Math.toRadians(-40))
                .lineToLinearHeading(new Pose2d(30, 50, Math.toRadians(-90)))
                //.back(15)
                .build();
    }

    public Trajectory azulIzq3(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(30, 50, Math.toRadians(-90)), Math.toRadians(-90))
                .splineToSplineHeading(new Pose2d(42, 30, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory azulIzq4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(42, 30, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(47, 30, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory azulIzq5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(47, 30, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(35,27))
                .build();
    }
    public Trajectory azulIzq6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(35, 22, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(43, 55))
                .build();
    }
}