package org.firstinspires.ftc.teamcode.Trayectories;


import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class AutosAzules {

    public Trajectory azulMedio1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(6, 50.4, Math.toRadians(-90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .splineToSplineHeading(new Pose2d(6.8, 26, Math.toRadians(-90)), Math.toRadians(-90))
                .build();
    }

    public Trajectory azulMedio2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(6.8, 26, Math.toRadians(-90)), Math.toRadians(-90))
                .back(7)
                .build();
    }

    public Trajectory azulMedio3(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(6.8, 19, Math.toRadians(-90)), Math.toRadians(-90))
                .splineToSplineHeading(new Pose2d(42, 26, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory azulMedio4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(42, 26, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(47, 26, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory azulMedio5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(47, 26, Math.toRadians(0)), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(43.2, 59.2, Math.toRadians(-90)))
                .build();
        //43.2 59.2
    }


    public Trajectory azulDer1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(6, 50.4, Math.toRadians(-90));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .splineToSplineHeading(new Pose2d(-2.4, 24.8, Math.toRadians(-117)), Math.toRadians(-117))
                .build();
    }

    public Trajectory azulDer2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(-2.4, 24.8, Math.toRadians(-117)), Math.toRadians(-177))
                .splineToSplineHeading(new Pose2d(8, 34.4, Math.toRadians(-1)), Math.toRadians(-1))
                .build();
    }

    public Trajectory azulDer3(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(8, 34.4, Math.toRadians(-1)), Math.toRadians(-1))
                .splineToSplineHeading(new Pose2d(42, 24, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory azulDer4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(42, 24, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(46, 24, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }
    public Trajectory azulDer5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(46, 24, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(43.2,59.2, Math.toRadians(-90)), Math.toRadians(-90))
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
//Trajectory traj = mysteryRobot.drive.trajectoryBuilder(new Pose2d(6.8,51.2, Math.toRadians(-90)), Math.toRadians(-90))
// .splineToSplineHeading(new Pose2d(6.4,20.4, Math.toRadians(-90)), Math.toRadians(-90))
// .splineToSplineHeading(new Pose2d(46,34, Math.toRadians(0)), Math.toRadians(0))
// .splineToSplineHeading(new Pose2d(43.2,59.2, Math.toRadians(-90)), Math.toRadians(-90))

