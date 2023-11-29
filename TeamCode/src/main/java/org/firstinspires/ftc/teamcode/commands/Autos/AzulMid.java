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

public class AzulMid extends SequentialCommandGroup {

    AutosAzules autosAzules = new AutosAzules();

    public AzulMid(MecanumDriveSubsystem drive, Elevator elevator, Intake intake, PixelHolder pixelHolder) {
        BooleanSupplier sup = new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {
                return AzulMid.super.isScheduled();
            }
        };
        addCommands(
                new TrajectoryFollowerCommand(drive, autosAzules.azulMedio1(drive.getDrive())),
                new IntakeCommand(intake,-.3),
                new TrajectoryFollowerCommand(drive, autosAzules.azulMedio2(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, autosAzules.azulMedio3(drive.getDrive())),
                new InstantCommand(pixelHolder::elevator),
                new WaitCommand(500),
                new ElevadorGoToPosition(elevator,1300),
                new WaitCommand(600),
                new InstantCommand(pixelHolder::leave),
                new WaitCommand(500),
                new TrajectoryFollowerCommand(drive,autosAzules.azulMedio4(drive.getDrive())),
                new WaitCommand(500),
                new InstantCommand(pixelHolder::pixel2Soltar),
                new WaitCommand(700),
                new TrajectoryFollowerCommand(drive,autosAzules.azulMedio5(drive.getDrive())),
                new InstantCommand(pixelHolder::elevator),
                new WaitCommand(500),
                new ElevadorGoToPosition(elevator,0),
                new TrajectoryFollowerCommand(drive,autosAzules.azulMedio6(drive.getDrive()))
        );
    }
}
