package org.firstinspires.ftc.teamcode.commands.Autos;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.Trayectories.FantasyRed;
import org.firstinspires.ftc.teamcode.commands.ElevadorGoToPosition;
import org.firstinspires.ftc.teamcode.commands.IntakeCommand;
import org.firstinspires.ftc.teamcode.commands.TrajectoryFollowerCommand;
import org.firstinspires.ftc.teamcode.subsystems.Elevator;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.PixelHolder;

import java.util.function.BooleanSupplier;

public class RedFantasy extends SequentialCommandGroup {

    FantasyRed fantasyRed = new FantasyRed();
    public RedFantasy(MecanumDriveSubsystem drive){
        BooleanSupplier sup = new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {return RedFantasy.super.isScheduled();}
        };
        addCommands(
                new TrajectoryFollowerCommand(drive, fantasyRed.RedFantasy1Mid(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, fantasyRed.RedFantasy2Mid(drive.getDrive())),//intake

                new TrajectoryFollowerCommand(drive, fantasyRed.RedFantasy3Mid(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, fantasyRed.RedFantasy4Mid(drive.getDrive())),

                new TrajectoryFollowerCommand(drive, fantasyRed.RedFantasy5Mid(drive.getDrive())),//parallel con elevador

                new TrajectoryFollowerCommand(drive, fantasyRed.RedFantasy6Mid(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, fantasyRed.RedFantasy7Mid(drive.getDrive())),//intake

                new TrajectoryFollowerCommand(drive, fantasyRed.RedFantasy8Mid(drive.getDrive()))

        );
        }
    }

