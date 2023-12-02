package org.firstinspires.ftc.teamcode.commands.Autos;

import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.Trayectories.AutosAzules;
import org.firstinspires.ftc.teamcode.Trayectories.AutosAzulesLargos;
import org.firstinspires.ftc.teamcode.commands.IntakeCommand;
import org.firstinspires.ftc.teamcode.commands.TrajectoryFollowerCommand;
import org.firstinspires.ftc.teamcode.subsystems.Elevator;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.PixelHolder;

import java.util.function.BooleanSupplier;

public class AzulMidLRG extends SequentialCommandGroup {

    AutosAzulesLargos autosAzulesLargos = new AutosAzulesLargos();

    public AzulMidLRG(MecanumDriveSubsystem drive, Elevator elevator, Intake intake, PixelHolder pixelHolder) {
        BooleanSupplier sup = new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {
                return AzulMidLRG.super.isScheduled();
            }
        };
        addCommands(
                new TrajectoryFollowerCommand(drive, autosAzulesLargos.AzulMid1LRG(drive.getDrive())),
                new IntakeCommand(intake,-.3),
                new WaitCommand(500),
                new TrajectoryFollowerCommand(drive, autosAzulesLargos.AzulMid2LRG(drive.getDrive()))


        );
    }}

