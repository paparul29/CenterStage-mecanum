package org.firstinspires.ftc.teamcode.commands.Autos;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.ParallelCommandGroup;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.Trayectories.AutosRojosPoderosos;
import org.firstinspires.ftc.teamcode.commands.ElevadorGoToPosition;
import org.firstinspires.ftc.teamcode.commands.IntakeCommand;
import org.firstinspires.ftc.teamcode.commands.TrajectoryFollowerCommand;
import org.firstinspires.ftc.teamcode.subsystems.Elevator;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.PixelHolder;

import java.util.function.BooleanSupplier;

public class RojoIzqLRG extends SequentialCommandGroup {
    AutosRojosPoderosos autosRojosPoderosos = new AutosRojosPoderosos();

    public RojoIzqLRG(MecanumDriveSubsystem drive, Elevator elevator, Intake intake, PixelHolder pixelHolder) {
        BooleanSupplier sup = new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {
                return RojoIzqLRG.super.isScheduled();
            }
        };
        addCommands(
                new TrajectoryFollowerCommand(drive, autosRojosPoderosos.rojoIzq1LRG(drive.getDrive())),
                new ParallelCommandGroup(new TrajectoryFollowerCommand(drive, autosRojosPoderosos.rojoIzq1yMedioLRG(drive.getDrive())), new ElevadorGoToPosition(elevator,1300), new InstantCommand(pixelHolder::elevator)),
                new InstantCommand(pixelHolder::leave),
                new WaitCommand(500),
                new TrajectoryFollowerCommand(drive, autosRojosPoderosos.rojoIzq2LRG(drive.getDrive())),
                new InstantCommand(pixelHolder::pixel2Soltar),
                new WaitCommand(500),
                new InstantCommand(pixelHolder::elevator),
                new WaitCommand(500),
                new ElevadorGoToPosition(elevator,0),
                new TrajectoryFollowerCommand(drive, autosRojosPoderosos.rojoIzq3LRG(drive.getDrive())),
                new TrajectoryFollowerCommand(drive,autosRojosPoderosos.rojoIzq4LRG(drive.getDrive())),
                new TrajectoryFollowerCommand(drive,autosRojosPoderosos.rojoIzq5LRG(drive.getDrive())),
                new InstantCommand(pixelHolder::grab),
                new WaitCommand(100),
                new ParallelCommandGroup(new TrajectoryFollowerCommand(drive,autosRojosPoderosos.rojoIzq5yMedioLRG(drive.getDrive())), new IntakeCommand(intake, -1)),

                new ParallelCommandGroup(new TrajectoryFollowerCommand(drive,autosRojosPoderosos.rojoIzq6LRG(drive.getDrive())), new IntakeCommand(intake, -1), new InstantCommand(pixelHolder::hold)),
                new TrajectoryFollowerCommand(drive,autosRojosPoderosos.rojoIzq7LRG(drive.getDrive())),
                new ElevadorGoToPosition(elevator,1800),
                new InstantCommand(pixelHolder::elevator),
                new WaitCommand(500),
                new InstantCommand(pixelHolder::leave),
                new WaitCommand(500),
                new TrajectoryFollowerCommand(drive,autosRojosPoderosos.rojoIzq8LRG(drive.getDrive())),
                new WaitCommand(500),
                new InstantCommand(pixelHolder::soltar),
                new WaitCommand(500),
                new InstantCommand(pixelHolder::elevator),
                new WaitCommand(500),
                new ElevadorGoToPosition(elevator,0)
        );
    }


}
