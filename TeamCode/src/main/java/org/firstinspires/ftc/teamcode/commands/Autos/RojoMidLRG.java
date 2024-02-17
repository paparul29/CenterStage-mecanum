package org.firstinspires.ftc.teamcode.commands.Autos;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.ParallelCommandGroup;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.Trayectories.RojosLRG;
import org.firstinspires.ftc.teamcode.commands.ElevadorGoToPosition;
import org.firstinspires.ftc.teamcode.commands.TrajectoryFollowerCommand;
import org.firstinspires.ftc.teamcode.subsystems.Elevator;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.PixelHolder;

import java.util.function.BooleanSupplier;

public class RojoMidLRG extends SequentialCommandGroup {
    RojosLRG rojosLRG = new RojosLRG();
    public RojoMidLRG(MecanumDriveSubsystem drive, Elevator elevator, Intake intake, PixelHolder pixelHolder) {
        BooleanSupplier sup = new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {
                return RojoMidLRG.super.isScheduled();
            }
        };
        addCommands(
                new InstantCommand(intake::arriba),
                new TrajectoryFollowerCommand(drive, rojosLRG.rojoMidLRG1(drive.getDrive())),
                new InstantCommand(pixelHolder::elevator),

                new ParallelCommandGroup(
                        new TrajectoryFollowerCommand(drive, rojosLRG.rojoLRG1ymedio(drive.getDrive())),
                        new ElevadorGoToPosition(elevator,1130)
                ),
                new InstantCommand(pixelHolder::leave),
                new WaitCommand(350),
                new ElevadorGoToPosition(elevator,950),
                new WaitCommand(230),
                new TrajectoryFollowerCommand(drive, rojosLRG.rojoLRG2(drive.getDrive())),
                new WaitCommand(300),
                new InstantCommand(pixelHolder::pixel1Soltar),
                new InstantCommand(pixelHolder::pixel2Soltar),
                new WaitCommand(300),
                new TrajectoryFollowerCommand(drive, rojosLRG.rojoLRG2ymedio(drive.getDrive())),
                new ElevadorGoToPosition(elevator,1400),
                new WaitCommand(300),

                new ParallelCommandGroup(
                        new InstantCommand(pixelHolder::elevator),
                        new InstantCommand(intake::trans),
                        new ElevadorGoToPosition(elevator,0),
                        new TrajectoryFollowerCommand(drive, rojosLRG.rojoLRG3(drive.getDrive()))
                )
        );
    }
}
