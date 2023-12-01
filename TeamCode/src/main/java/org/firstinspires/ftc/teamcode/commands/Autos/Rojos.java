package org.firstinspires.ftc.teamcode.commands.Autos;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.Elevator;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.PixelHolder;

@Autonomous
public class Rojos extends CommandOpMode {
    Intake intake;
    MecanumDriveSubsystem drive;
    SampleMecanumDrive sampleMecanumDrive;
    Elevator elevator;
    PixelHolder pixelHolder;
    RojoIzq rojoIzq;
    RojoDer rojoDer;
    RojoMid rojoMid;
    RojoIzqPDR rojoIzqLRG;

    @Override
    public void initialize() {
        intake = new Intake(telemetry, hardwareMap);
        sampleMecanumDrive = new SampleMecanumDrive(hardwareMap);
        drive = new MecanumDriveSubsystem(sampleMecanumDrive, false, false);
        pixelHolder = new PixelHolder(hardwareMap, telemetry);
        elevator = new Elevator(telemetry, hardwareMap);
        rojoIzq = new RojoIzq(drive, elevator, intake, pixelHolder);
        //rojoDer = new RojoDer(drive,elevator,intake,pixelHolder);
        //rojoMid = new RojoMid(drive,elevator,intake,pixelHolder);
        rojoIzqLRG = new RojoIzqPDR(drive,elevator, intake, pixelHolder);
        schedule(rojoIzqLRG);

    }
}

