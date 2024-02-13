package org.firstinspires.ftc.teamcode.Trayectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class FantasyRed {


    public Trajectory RedFantasy1Mid(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(-36, -63.32, Math.toRadians(90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineToLinearHeading(new Pose2d(-35.58, -32.37, Math.toRadians(90)))
                .build();
    }
    public Trajectory RedFantasy2Mid(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(-35.58, -32.37, Math.toRadians(90)), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(-60.30, -36.33, Math.toRadians(180)))
                .build();
    }

    public Trajectory RedFantasy3Mid(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(-60.30, -36.33, Math.toRadians(180)), Math.toRadians(180))
                .lineToLinearHeading(new Pose2d(-40.67, -36.14, Math.toRadians(0)))
                .build();
    }

    public Trajectory RedFantasy4Mid(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(-40.65, -36.14, Math.toRadians(0)), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(52.18, -35.95, Math.toRadians(0)))
                .build();
    }

    public Trajectory RedFantasy5Mid(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(52, -35.95, Math.toRadians(0)), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(38.97, -36.33, Math.toRadians(180)))
                .build();
    }
    public Trajectory RedFantasy6Mid(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(38.97, -36.33, Math.toRadians(180)), Math.toRadians(180))
                .lineToLinearHeading(new Pose2d(-61.05, -36.33, Math.toRadians(180)))
                .build();
    }

    public Trajectory RedFantasy7Mid(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(-61.05, -36.33, Math.toRadians(180)), Math.toRadians(180))
                .lineToLinearHeading(new Pose2d(-39.16, -36.52, Math.toRadians(0)))
                 .build();
    }
    public Trajectory RedFantasy8Mid(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(-39.16, -36.52, Math.toRadians(0)), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(52.75, -35.95, Math.toRadians(0)))
                .build();
    }
}

