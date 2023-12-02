package org.firstinspires.ftc.teamcode.Trayectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class AutosRojosLargos {
    public Trajectory rojoMid1LRG(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(-37, -60, Math.toRadians(90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(new Pose2d(-37, -60, Math.toRadians(89)), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(-40, -35, Math.toRadians(90)))
                .build();
    }

    public Trajectory rojoMid2LRG(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(-40, -35, Math.toRadians(90))), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(-36, -56, Math.toRadians(0)))
                .build();
    }
}
    //Trajectory traj = mysteryRobot.drive.trajectoryBuilder(new Pose2d(-36.8,-61.6, Math.toRadians(90)), Math.toRadians(90))
// .splineToSplineHeading(new Pose2d(-36.8,-28.4, Math.toRadians(92)), Math.toRadians(92))
// .splineToSplineHeading(new Pose2d(-37.2,-56, Math.toRadians(0)), Math.toRadians(0))
