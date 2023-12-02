package org.firstinspires.ftc.teamcode.commands.Autos;

import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.Trayectories.AutosAzules;
import org.firstinspires.ftc.teamcode.Trayectories.AutosAzulesLargos;
import org.firstinspires.ftc.teamcode.Trayectories.AutosRojosLargos;
import org.firstinspires.ftc.teamcode.commands.IntakeCommand;
import org.firstinspires.ftc.teamcode.commands.TrajectoryFollowerCommand;
import org.firstinspires.ftc.teamcode.subsystems.Elevator;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.PixelHolder;

import java.util.function.BooleanSupplier;

public class RojoMidLRG extends SequentialCommandGroup {

    AutosRojosLargos autosRojosLargos = new AutosRojosLargos();

    public RojoMidLRG(MecanumDriveSubsystem drive, Elevator elevator, Intake intake, PixelHolder pixelHolder) {
        BooleanSupplier sup = new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {
                return RojoMidLRG.super.isScheduled();
            }
        };
        addCommands(
                new TrajectoryFollowerCommand(drive, autosRojosLargos.rojoMid1LRG(drive.getDrive())),
                new IntakeCommand(intake,-.3),
                new WaitCommand(500),
                new TrajectoryFollowerCommand(drive, autosRojosLargos.rojoMid2LRG(drive.getDrive()))


        );
    }}
//Trajectory traj = mysteryRobot.drive.trajectoryBuilder(new Pose2d(-36.8,-61.6, Math.toRadians(90)), Math.toRadians(90))
// .splineToSplineHeading(new Pose2d(-36.8,-28.4, Math.toRadians(92)), Math.toRadians(92))
// .splineToSplineHeading(new Pose2d(-37.2,-56, Math.toRadians(0)), Math.toRadians(0))