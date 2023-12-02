package org.firstinspires.ftc.teamcode.Trayectories;

import android.os.Trace;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class AutosAzulesLargos {

    public Trajectory AzulMid1LRG(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(-37, -56.4, Math.toRadians(90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(new Pose2d(-37, -56.4, Math.toRadians(90)), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(-30, -32, Math.toRadians(90)))
                .build();
    }

    public Trajectory AzulMid2LRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(-30, -32, Math.toRadians(90))), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(-30, Math.toRadians(0)))
                .build();
    }

    public Trajectory AzulDer1LRG(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(-37, -56.4, Math.toRadians(90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(new Pose2d(-37, -56.4, Math.toRadians(90)), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(-30, Math.toRadians(80)))
                .build();
    }

    public Trajectory AzulIzq1LRG(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(-37, -56.4, Math.toRadians(90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(new Pose2d(-37, -56.4, Math.toRadians(90)), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(-30, Math.toRadians(100)))
                .build();
    }
    //Trajectory traj = mysteryRobot.drive.trajectoryBuilder(new Pose2d(-37.2,56, Math.toRadians(-90)), Math.toRadians(-90))
    // .splineToSplineHeading(new Pose2d(-36,22.4, Math.toRadians(-90)), Math.toRadians(-90))
    // .splineToSplineHeading(new Pose2d(-36.8,51.6, Math.toRadians(3)), Math.toRadians(3))

}
