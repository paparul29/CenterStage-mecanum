package org.firstinspires.ftc.teamcode.commands.Autos;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.ParallelCommandGroup;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.Trayectories.AzulBuenos;
import org.firstinspires.ftc.teamcode.commands.ElevadorGoToPosition;
import org.firstinspires.ftc.teamcode.commands.IntakeCommand;
import org.firstinspires.ftc.teamcode.commands.TrajectoryFollowerCommand;
import org.firstinspires.ftc.teamcode.subsystems.Elevator;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.PixelHolder;

import java.util.function.BooleanSupplier;

public class AzulesBuenosMid extends SequentialCommandGroup {

    AzulBuenos azulBuenos = new AzulBuenos();
    public AzulesBuenosMid(MecanumDriveSubsystem drive, Elevator elevator, Intake intake, PixelHolder pixelHolder){
        BooleanSupplier sup = new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {return AzulesBuenosMid.super.isScheduled();}
        };
        addCommands(

                new TrajectoryFollowerCommand(drive, azulBuenos.azulMidB1(drive.getDrive())),
                new InstantCommand(intake::arriba),
                new InstantCommand(pixelHolder::elevator),

                new ParallelCommandGroup(
                        new TrajectoryFollowerCommand(drive, azulBuenos.azulMidB1ymedio(drive.getDrive())),
                        new ElevadorGoToPosition(elevator,1350)
                ),
                new InstantCommand(pixelHolder::leave),
                new WaitCommand(250),
                new ElevadorGoToPosition(elevator,910),
                new WaitCommand(230),
                new TrajectoryFollowerCommand(drive, azulBuenos.azulMidB2(drive.getDrive())),
                new WaitCommand(320),
                new InstantCommand(pixelHolder::pixel1Soltar),
                new InstantCommand(pixelHolder::pixel2Soltar),
                new WaitCommand(200),
                new ParallelCommandGroup(
                new TrajectoryFollowerCommand(drive, azulBuenos.azulMidB2ymedio(drive.getDrive())),
                new ElevadorGoToPosition(elevator,1200)
                        ),
                new ParallelCommandGroup(
                new InstantCommand(pixelHolder::elevator),
                new InstantCommand(intake::trans)
                ),
                new ElevadorGoToPosition(elevator,0),
                new InstantCommand(pixelHolder::grab),


                new TrajectoryFollowerCommand(drive, azulBuenos.azulMidB3(drive.getDrive())),
                new InstantCommand(intake::arriba),

                new ParallelCommandGroup(
                        new TrajectoryFollowerCommand(drive, azulBuenos.azulMidB4(drive.getDrive())),
                        new IntakeCommand(intake,-1),
                        new InstantCommand(pixelHolder::grab)
                ),
                new InstantCommand(intake::abajo),
                new IntakeCommand(intake,-1),
                new WaitCommand(300),
                new InstantCommand(intake::masAbajo),
                new IntakeCommand(intake,-1),

                new ParallelCommandGroup(
                new TrajectoryFollowerCommand(drive, azulBuenos.azulMidB5(drive.getDrive())),
                        new IntakeCommand(intake,-1)
                ),

                new ParallelCommandGroup(
                        new InstantCommand(pixelHolder::pixel2Hold),
                        new InstantCommand(pixelHolder::pixel1Hold),
                        new InstantCommand(intake::arriba),
                        new IntakeCommand(intake,-1),
                        new TrajectoryFollowerCommand(drive, azulBuenos.azulMidB6(drive.getDrive()))
                ),
                new InstantCommand(pixelHolder::elevator),
                new WaitCommand(270),
                new ElevadorGoToPosition(elevator,1500),
                new WaitCommand(400),
                new InstantCommand(pixelHolder::leave),
                new WaitCommand(500),
                new TrajectoryFollowerCommand(drive, azulBuenos.azulMidB6ymedio(drive.getDrive())),
                new WaitCommand(250),
                new InstantCommand(pixelHolder::pixel1Soltar),
                new InstantCommand(pixelHolder::pixel2Soltar),
                new WaitCommand(230),
                new TrajectoryFollowerCommand(drive, azulBuenos.azulMidB7(drive.getDrive())),
                new WaitCommand(200),
                new InstantCommand(pixelHolder::elevator),
                new InstantCommand(intake::trans),
                new WaitCommand(200),
                new ElevadorGoToPosition(elevator,0)
        );
    }
}
