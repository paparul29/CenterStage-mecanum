package org.firstinspires.ftc.teamcode.Trayectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class AzulBuenos {

    public Trajectory azulMidB1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(12, 61, Math.toRadians(-90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineToLinearHeading(new Pose2d(11.76, 32.5, Math.toRadians(-90)))
                .build();
    }
    public Trajectory azulMidB1ymedio(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(11.76, 32.5, Math.toRadians(-90))), Math.toRadians(-90))
                .lineToLinearHeading(new Pose2d(47, 33.4, Math.toRadians(0)))
                .build();
    }
    public Trajectory azulMidB2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(47, 33.5, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(53.2, 33.5, Math.toRadians(0)))
                .build();
    }
    public Trajectory azulMidB2ymedio(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(53.2, 33.5, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(45, 33.5, Math.toRadians(0)))
                .build();
    }
    public Trajectory azulMidB3(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(45, 33.5, Math.toRadians(180))), Math.toRadians(180))
                .lineToLinearHeading(new Pose2d(39.26, 7, Math.toRadians(180)))
                .build();
    }
    public Trajectory azulMidB4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(39.26, 7, Math.toRadians(180))), Math.toRadians(180))
                .lineToLinearHeading(new Pose2d(-57.8, 11, Math.toRadians(180)))
                .build();
    }
    public Trajectory azulMidB5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(-57.8, 11, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(-40.69, -2.38, Math.toRadians(0)))
                .build();
    }
    public Trajectory azulMidB6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(-40.69, -2.38, Math.toRadians(0))), Math.toRadians(0))
                .splineTo(new Vector2d(12.40, 6.04), Math.toRadians(22.18))
                .splineTo(new Vector2d(47, 33), Math.toRadians(0))
                .build();
    }
    public Trajectory azulMidB6ymedio(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(47, 33, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(52.8, 35, Math.toRadians(0)))
                .build();
    }
    public Trajectory azulMidB7(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(52.8, 33, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(47, 33, Math.toRadians(0)))
                .build();
    }




    public Trajectory azulDerB1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(12, 61, Math.toRadians(-90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .splineTo(new Vector2d(7.6, 37.84), Math.toRadians(-107))
                .build();
    }
    public Trajectory azulDerB1ymedio(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(7.6, 37.84, Math.toRadians(-107))), Math.toRadians(-107))
                .lineToLinearHeading(new Pose2d(47, 27, Math.toRadians(0)))
                .build();
    }
    public Trajectory azulDerB2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(47, 27, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(53, 27, Math.toRadians(0)))
                .build();
    }
    public Trajectory azulDerB2ymedio(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(53, 27, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(45, 28, Math.toRadians(0)))
                .build();
    }
    public Trajectory azulDerB3(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(45, 27, Math.toRadians(180))), Math.toRadians(180))
                .lineToLinearHeading(new Pose2d(40.86, 10, Math.toRadians(180)))
                .build();
    }
    public Trajectory azulDerB4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(40.86, 10, Math.toRadians(180))), Math.toRadians(180))
                .lineToLinearHeading(new Pose2d(-59.35, 11.8, Math.toRadians(180)))
                .build();
    }
    public Trajectory azulDerB5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(-59.35, 11.8, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(-40.69, -2.38, Math.toRadians(0)))
                .build();
    }
    public Trajectory azulDerB6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(-40.69, -2.38, Math.toRadians(0))), Math.toRadians(0))
                .splineTo(new Vector2d(8.40, 10.66), Math.toRadians(20.23))
                .splineTo(new Vector2d(45, 35), Math.toRadians(0))
                .build();
    }
    public Trajectory azulDerB6ymedio(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(45, 35, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(53, 35, Math.toRadians(0)))
                .build();
    }
    public Trajectory azulDerB7(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(53, 35, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(47, 35, Math.toRadians(0)))
                .build();
    }




    public Trajectory azulIzqB1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(12, 61, Math.toRadians(-90));

        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineToLinearHeading(new Pose2d(23.21, 37.19, Math.toRadians(-70)))
                .build();
    }
    public Trajectory azulIzqB1yUnCuarto(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(23.21, 37.19, Math.toRadians(-70))), Math.toRadians(-70))
                .lineToLinearHeading(new Pose2d(25.43, 45.77, Math.toRadians(0)))
                .build();
    }
    public Trajectory azulIzqB2(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(25.43, 45.77, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(53, 41.6, Math.toRadians(0)))
                .build();
    }
    public Trajectory azulIzqB2ymedio(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(53, 41.6, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(47, 41.6, Math.toRadians(0)))
                .build();
    }
    public Trajectory azulIzqB3(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(47, 41.6, Math.toRadians(180))), Math.toRadians(180))
                .lineToLinearHeading(new Pose2d(41.96, 10, Math.toRadians(180)))
                .build();
    }
    public Trajectory azulIzqB4(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(41.96, 10, Math.toRadians(180))), Math.toRadians(180))
                .lineToLinearHeading(new Pose2d(-58.3, 12.45, Math.toRadians(180)))
                .build();
    }
    public Trajectory azulIzqB5(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(-58.3, 12.45, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(-40.69, -2.38, Math.toRadians(0)))
                .build();
    }
    public Trajectory azulIzqB6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(-40, -2, Math.toRadians(0))), Math.toRadians(0))
                .splineTo(new Vector2d(15.26, 12.08), Math.toRadians(25))
                .splineTo(new Vector2d(47, 35), Math.toRadians(0))
                .build();
    }
    public Trajectory azulIzqB6ymedio(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(47, 35, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(53, 35, Math.toRadians(0)))
                .build();
    }
    public Trajectory azulIzqB7(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder((new Pose2d(53, 35, Math.toRadians(0))), Math.toRadians(0))
                .lineToLinearHeading(new Pose2d(48, 35, Math.toRadians(0)))
                .build();
    }

}
