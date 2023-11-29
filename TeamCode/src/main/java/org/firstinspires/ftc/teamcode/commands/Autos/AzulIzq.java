package org.firstinspires.ftc.teamcode.commands.Autos;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.Trayectories.AutosAzules;
import org.firstinspires.ftc.teamcode.commands.ElevadorGoToPosition;
import org.firstinspires.ftc.teamcode.commands.IntakeCommand;
import org.firstinspires.ftc.teamcode.commands.TrajectoryFollowerCommand;
import org.firstinspires.ftc.teamcode.subsystems.Elevator;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.PixelHolder;

import java.util.function.BooleanSupplier;

public class AzulIzq extends SequentialCommandGroup {

    AutosAzules autosAzules = new AutosAzules();

    public AzulIzq(MecanumDriveSubsystem drive, Elevator elevator, Intake intake, PixelHolder pixelHolder) {
        BooleanSupplier sup = new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {
                return AzulIzq.super.isScheduled();
            }
        };

        addCommands(
                new TrajectoryFollowerCommand(drive, autosAzules.azulIzq1(drive.getDrive())),
                new IntakeCommand(intake,-.3),
                new TrajectoryFollowerCommand(drive, autosAzules.azulIzq2(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, autosAzules.azulIzq3(drive.getDrive())),
                new InstantCommand(pixelHolder::elevator),
                new WaitCommand(500),
                new ElevadorGoToPosition(elevator,1300),
                new WaitCommand(600),
                new InstantCommand(pixelHolder::leave),
                new WaitCommand(500),
                new TrajectoryFollowerCommand(drive,autosAzules.azulIzq4(drive.getDrive())),
                new WaitCommand(500),
                new InstantCommand(pixelHolder::pixel2Soltar),
                new WaitCommand(700),
                new TrajectoryFollowerCommand(drive,autosAzules.azulIzq5(drive.getDrive())),
                new InstantCommand(pixelHolder::elevator),
                new WaitCommand(500),
                new ElevadorGoToPosition(elevator,0),
                new TrajectoryFollowerCommand(drive,autosAzules.azulIzq6(drive.getDrive()))
        );
    }
}