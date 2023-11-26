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

public class RojoMid extends SequentialCommandGroup {
    AutosRojos autosRojos = new AutosRojos();
    public RojoMid(MecanumDriveSubsystem drive, Elevator elevator, Intake intake, PixelHolder pixelHolder){
        addCommands(
                new TrajectoryFollowerCommand(drive, autosRojos.rojoMedio1(drive.getDrive())),
                new IntakeCommand(intake,2),
                new TrajectoryFollowerCommand(drive,autosRojos.rojoMedio2(drive.getDrive())),
                new TrajectoryFollowerCommand(drive,autosRojos.rojoMedio3(drive.getDrive())),
                new InstantCommand(pixelHolder::elevator),
                new WaitCommand(500),
                new ElevadorGoToPosition(elevator,1300),
                new WaitCommand(500),
                new InstantCommand(pixelHolder::leave),
                new WaitCommand(300),
                new TrajectoryFollowerCommand(drive,autosRojos.rojoMedio4(drive.getDrive())),
                new WaitCommand(500),
                new InstantCommand(pixelHolder::pixel2Soltar),
                new WaitCommand(500),
                new TrajectoryFollowerCommand(drive,autosRojos.rojoMedio5(drive.getDrive()))

        );
    }
}
