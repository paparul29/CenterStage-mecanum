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

public class BuenosRojosMid extends SequentialCommandGroup {

    RojosBuenos rojosBuenos = new RojosBuenos();
    public BuenosRojosMid(MecanumDriveSubsystem drive, Elevator elevator, Intake intake, PixelHolder pixelHolder){
        BooleanSupplier sup = new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {return BuenosRojosMid.super.isScheduled();}
        };
        addCommands(
                new InstantCommand(intake::arriba),
                new TrajectoryFollowerCommand(drive, rojosBuenos.rojoMidB1(drive.getDrive())),
                new InstantCommand(pixelHolder::elevator),

                new ParallelCommandGroup(
                        new TrajectoryFollowerCommand(drive, rojosBuenos.rojoMidB1ymedio(drive.getDrive())),
                        new ElevadorGoToPosition(elevator,1130)
                ),
                new InstantCommand(pixelHolder::leave),
                new WaitCommand(350),
                new ElevadorGoToPosition(elevator,910),
                new WaitCommand(230),
                new TrajectoryFollowerCommand(drive, rojosBuenos.rojoMidB2(drive.getDrive())),
                new WaitCommand(300),
                new InstantCommand(pixelHolder::pixel1Soltar),
                new InstantCommand(pixelHolder::pixel2Soltar),
                new WaitCommand(300),
                new TrajectoryFollowerCommand(drive, rojosBuenos.rojoMidB2ymedio(drive.getDrive())),
                new ElevadorGoToPosition(elevator,1400),
                new WaitCommand(300),
                new ParallelCommandGroup(
                new InstantCommand(pixelHolder::elevator),
                new InstantCommand(intake::trans),
                new ElevadorGoToPosition(elevator,0),
                new TrajectoryFollowerCommand(drive, rojosBuenos.rojoMidB3(drive.getDrive()))
                        ),
                new InstantCommand(intake::arriba),
                new InstantCommand(pixelHolder::grab),

                new ParallelCommandGroup(
                new TrajectoryFollowerCommand(drive, rojosBuenos.rojoMidB4(drive.getDrive())),
                new IntakeCommand(intake,-1)
                        ),
                new InstantCommand(intake::abajo),
                new IntakeCommand(intake,-1),
                new InstantCommand(intake::masAbajo),
                new IntakeCommand(intake,-1),

                new ParallelCommandGroup(
                new IntakeCommand(intake,-1),
                new TrajectoryFollowerCommand(drive, rojosBuenos.rojoMidB5(drive.getDrive()))
                        ),

                new ParallelCommandGroup(
                        new InstantCommand(pixelHolder::pixel2Hold),
                        new InstantCommand(pixelHolder::pixel1Hold),
                        new InstantCommand(intake::arriba),
                        new IntakeCommand(intake,-1),
                        new TrajectoryFollowerCommand(drive, rojosBuenos.rojoMidB6(drive.getDrive()))
                ),
                new InstantCommand(pixelHolder::elevator),
                new WaitCommand(250),
                new ElevadorGoToPosition(elevator,1450),
                new WaitCommand(350),
                new InstantCommand(pixelHolder::leave),
                new WaitCommand(400),
                new TrajectoryFollowerCommand(drive, rojosBuenos.rojoMidB6ymedio(drive.getDrive())),
                new WaitCommand(250),
                new InstantCommand(pixelHolder::pixel1Soltar),
                new InstantCommand(pixelHolder::pixel2Soltar),
                new WaitCommand(350),

                new ParallelCommandGroup(
                new TrajectoryFollowerCommand(drive, rojosBuenos.rojoMidB7(drive.getDrive())),
                new InstantCommand(pixelHolder::elevator),
                new InstantCommand(intake::trans),
                new ElevadorGoToPosition(elevator,0)
                )

                );

    }
}
