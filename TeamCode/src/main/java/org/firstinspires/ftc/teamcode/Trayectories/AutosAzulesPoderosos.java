package org.firstinspires.ftc.teamcode.Trayectories;


import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class AutosAzulesPoderosos {

    //CORTOS
    public Trajectory azulMedio1LRG(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(6, 50.4, Math.toRadians(-90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineToLinearHeading(new Pose2d(9, 25, Math.toRadians(-90)))
                .build();
    }

    public Trajectory azulMedio2LRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(9, 26, Math.toRadians(-90)), Math.toRadians(-90))
                .back(20)
                .build();
    }

    public Trajectory azulMedio3LRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(6, 46, Math.toRadians(-90)), Math.toRadians(-90))
                .splineToSplineHeading(new Pose2d(42, 26, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory azulMedio4LRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(42, 26, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(47, 26, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }





    public Trajectory azulDer1LRG(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(8, 50.4, Math.toRadians(-90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineToLinearHeading(new Pose2d(5, 32, Math.toRadians(-145)))
                .build();
    }

    public Trajectory azulDer2vLRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(5, 32, Math.toRadians(-145)), Math.toRadians(-145))
                .lineToLinearHeading(new Pose2d(25, 50, Math.toRadians(-90)))
                .build();
    }

    public Trajectory azulDer3LRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(25, 50, Math.toRadians(-90)), Math.toRadians(-90))
                .splineToSplineHeading(new Pose2d(42, 19, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory azulDer4LRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(42, 19, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(50.3, 19, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }




    public Trajectory azulIzq1LRG(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(6, 50.4, Math.toRadians(-90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineToLinearHeading(new Pose2d(7, 35, Math.toRadians(-40)))
                .build();
    }

    public Trajectory azulIzq2LRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(7, 35, Math.toRadians(-40)), Math.toRadians(-40))
                .lineToLinearHeading(new Pose2d(30, 50, Math.toRadians(-90)))
                //.back(15)
                .build();
    }

    public Trajectory azulIzq3LRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(30, 50, Math.toRadians(-90)), Math.toRadians(-90))
                .splineToSplineHeading(new Pose2d(42, 30, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory azulIzq4LRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(42, 30, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(47, 30, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

}