package org.firstinspires.ftc.teamcode.commands.Autos;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.Trayectories.AutosRojos;
import org.firstinspires.ftc.teamcode.commands.ElevadorGoToPosition;
import org.firstinspires.ftc.teamcode.commands.IntakeCommand;
import org.firstinspires.ftc.teamcode.commands.TrajectoryFollowerCommand;
import org.firstinspires.ftc.teamcode.subsystems.Elevator;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.PixelHolder;

public class RojoDer extends SequentialCommandGroup {

    AutosRojos autosRojos = new AutosRojos();
    public RojoDer(MecanumDriveSubsystem drive, Elevator elevator, Intake intake, PixelHolder pixelHolder){
        addCommands(
                new TrajectoryFollowerCommand(drive, autosRojos.rojoDer1(drive.getDrive())),
                new IntakeCommand(intake, -.3),
                new TrajectoryFollowerCommand(drive, autosRojos.rojoDer2(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, autosRojos.rojoDer3(drive.getDrive())),
                new InstantCommand(pixelHolder::elevator),
                new WaitCommand(500),
                new ElevadorGoToPosition(elevator,1300),
                new WaitCommand(600),
                new InstantCommand(pixelHolder::leave),
                new WaitCommand(500),
                new TrajectoryFollowerCommand(drive,autosRojos.rojoDer4(drive.getDrive())),
                new WaitCommand(500),
                new InstantCommand(pixelHolder::pixel2Soltar),
                new WaitCommand(700),
                new TrajectoryFollowerCommand(drive, autosRojos.rojoDer5(drive.getDrive())),
                new InstantCommand(pixelHolder::elevator),
                new WaitCommand(500),
                new ElevadorGoToPosition(elevator,0),
                new TrajectoryFollowerCommand(drive, autosRojos.rojoDer6(drive.getDrive()))
        );
    }
}
