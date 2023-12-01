package org.firstinspires.ftc.teamcode.Trayectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class AutosRojosLargos {
    public Trajectory rojoMid1LRG(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(6, -56.4, Math.toRadians(89));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(new Pose2d(6, -58, Math.toRadians(89)), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(9, -30, Math.toRadians(90)))
                .build();
    }

    public Trajectory rojoMid2LRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(9, -30, Math.toRadians(90))), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(6, -49, Math.toRadians(90)))
                .build();
    }

    public Trajectory rojoMid3LRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(6, -49, Math.toRadians(90))), Math.toRadians(90))
                .splineToSplineHeading(new Pose2d(42, -31, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory rojoMid4LRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(42, -31, Math.toRadians(0)), Math.toRadians(0))
                .splineToSplineHeading(new Pose2d(47, -31, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory rojoMid5LRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(47, -31, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(35, -26.5))
                .build();
    }

    public Trajectory rojoMid6LRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(35, -26.5, Math.toRadians(0)), Math.toRadians(0))
                .lineTo(new Vector2d(47, -60))
                .build();
    }
}
