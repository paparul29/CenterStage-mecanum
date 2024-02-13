package org.firstinspires.ftc.teamcode.commands.Autos;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.ParallelCommandGroup;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.Trayectories.RojosBuenos;
import org.firstinspires.ftc.teamcode.commands.ElevadorGoToPosition;
import org.firstinspires.ftc.teamcode.commands.IntakeCommand;
import org.firstinspires.ftc.teamcode.commands.TrajectoryFollowerCommand;
import org.firstinspires.ftc.teamcode.subsystems.Elevator;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.PixelHolder;

import java.util.function.BooleanSupplier;

public class BuenosRojosIzq extends SequentialCommandGroup {
    RojosBuenos rojosBuenos = new RojosBuenos();

    public BuenosRojosIzq(MecanumDriveSubsystem drive, Elevator elevator, Intake intake, PixelHolder pixelHolder) {
        BooleanSupplier sup = new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {
                return BuenosRojosIzq.super.isScheduled();}
        };
        addCommands(
                new TrajectoryFollowerCommand(drive, rojosBuenos.rojoIzqB1(drive.getDrive())),
                new InstantCommand(intake::arriba),
                new InstantCommand(pixelHolder::elevator),

                new ParallelCommandGroup(
                        new TrajectoryFollowerCommand(drive, rojosBuenos.rojoIzqB1ymedio(drive.getDrive())),
                        new ElevadorGoToPosition(elevator,1130)
                ),
                new InstantCommand(pixelHolder::leave),
                new WaitCommand(250),
                new TrajectoryFollowerCommand(drive, rojosBuenos.rojoIzqB2(drive.getDrive())),
                new WaitCommand(350),
                new InstantCommand(pixelHolder::pixel1Soltar),
                new InstantCommand(pixelHolder::pixel2Soltar),
                new WaitCommand(200),
                new TrajectoryFollowerCommand(drive, rojosBuenos.rojoIzqB2ymedio(drive.getDrive())),
                new InstantCommand(pixelHolder::elevator),
                new WaitCommand(300),
                new InstantCommand(intake::trans),
                new WaitCommand(300),
                new ElevadorGoToPosition(elevator,0),
                new InstantCommand(pixelHolder::grab),


                new TrajectoryFollowerCommand(drive, rojosBuenos.rojoIzqB3(drive.getDrive())),
                new InstantCommand(intake::arriba),

                new ParallelCommandGroup(
                        new TrajectoryFollowerCommand(drive, rojosBuenos.rojoIzqB4(drive.getDrive())),
                        new IntakeCommand(intake,-1)
                ),
                new InstantCommand(intake::abajo),
                new IntakeCommand(intake,-1),
                new WaitCommand(500),
                new InstantCommand(intake::masAbajo),
                new IntakeCommand(intake,-1),

                new ParallelCommandGroup(
                        new IntakeCommand(intake,-1),
                        new TrajectoryFollowerCommand(drive, rojosBuenos.rojoIzqB5(drive.getDrive()))
                ),

                new ParallelCommandGroup(
                        new InstantCommand(pixelHolder::pixel2Hold),
                        new InstantCommand(pixelHolder::pixel1Hold),
                        new InstantCommand(intake::arriba),
                        new IntakeCommand(intake,-1),
                        new TrajectoryFollowerCommand(drive, rojosBuenos.rojoIzqB6(drive.getDrive()))
                ),
                new InstantCommand(pixelHolder::elevator),
                new WaitCommand(300),
                new ElevadorGoToPosition(elevator,1300),
                new WaitCommand(300),
                new InstantCommand(pixelHolder::leave),
                new WaitCommand(300),
                new TrajectoryFollowerCommand(drive, rojosBuenos.rojoIzqB6ymedio(drive.getDrive())),
                new WaitCommand(250),
                new InstantCommand(pixelHolder::pixel1Soltar),
                new InstantCommand(pixelHolder::pixel2Soltar),
                new WaitCommand(370),
                new TrajectoryFollowerCommand(drive, rojosBuenos.rojoIzqB7(drive.getDrive())),
                new WaitCommand(200),
                new InstantCommand(pixelHolder::elevator),
                new InstantCommand(intake::trans),
                new WaitCommand(250),
                new ElevadorGoToPosition(elevator,0)
        );
    }
}
