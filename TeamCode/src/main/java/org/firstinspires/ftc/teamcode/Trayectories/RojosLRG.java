package org.firstinspires.ftc.teamcode.Trayectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class RojosLRG {

    public Trajectory rojoMidLRG1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(-36, -61, Math.toRadians(90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineToLinearHeading(new Pose2d(-36.59, -35, Math.toRadians(90)))
                .build();
    }
    public Trajectory rojoLRG1ymedio(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(-36.59, -29.92, Math.toRadians(90))), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(-28.95, -36.59, Math.toRadians(0)))
                .build();
    }
    public Trajectory rojoLRG2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(-28.95, -36.59, Math.toRadians(0))), Math.toRadians(90))
                .lineToLinearHeading(new Pose2d(53, -36.03, Math.toRadians(0)))
                .build();
    }
    public Trajectory rojoLRG2ymedio(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(53,-36, Math.toRadians(0)))
                .lineToLinearHeading(new Pose2d(43.26, -36.03, Math.toRadians(0)))
                .build();
    }
    public Trajectory rojoLRG3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(43.26,-36, Math.toRadians(0)))
                .lineToLinearHeading(new Pose2d(51.31, -15, Math.toRadians(0)))
                .build();
    }

}
