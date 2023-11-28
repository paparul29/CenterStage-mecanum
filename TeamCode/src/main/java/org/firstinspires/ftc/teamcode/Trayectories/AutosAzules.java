package org.firstinspires.ftc.teamcode.Trayectories;


import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class AutosAzules {

    public Trajectory azulMedio1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(6, 50.4, Math.toRadians(-90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineToLinearHeading(new Pose2d(6, 25, Math.toRadians(-90)))
                .build();
    }

    public Trajectory azulMedio2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(6, 26, Math.toRadians(-90)), Math.toRadians(-90))
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
        return drive.trajectoryBuilder(new Pose2d(47, 25, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(35,25))
                .build();
    }
    public Trajectory azulMedio6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(35, 26, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(43, 55))
                .build();
    }




    public Trajectory azulDer1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(6, 50.4, Math.toRadians(-90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineToLinearHeading(new Pose2d(8, 35, Math.toRadians(-140)))
                .build();
    }

    public Trajectory azulDer2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(8, 35, Math.toRadians(-140)), Math.toRadians(-140))
                .back(15)
                .build();
    }

    public Trajectory azulDer3(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(6, 35, Math.toRadians(-90)), Math.toRadians(-90))
                .splineToSplineHeading(new Pose2d(42, 19, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory azulDer4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(42, 19, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(47, 19, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory azulDer5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(47, 19, Math.toRadians(0)), Math.toRadians(0))
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
                .splineToSplineHeading(new Pose2d(15.2, 29.2, Math.toRadians(-86)), Math.toRadians(-86))
                .build();
    }

    public Trajectory azulIzq2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(15.2, 29.2, Math.toRadians(-86)), Math.toRadians(-86))
                .splineToSplineHeading(new Pose2d(15.6, 43.2, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory azulIzq3(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(15.6, 43.2, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(42, 34.8, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory azulIzq4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(42, 34.8, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(46, 34.8, Math.toRadians(0)), Math.toRadians(0))
                .build();

    }
    public Trajectory azulIzq5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(46, 34.8, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(43.2,59.2, Math.toRadians(-90)), Math.toRadians(-90))
                .build();

    }
}