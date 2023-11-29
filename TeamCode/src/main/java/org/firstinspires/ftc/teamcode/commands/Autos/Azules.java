package org.firstinspires.ftc.teamcode.commands.Autos;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.Elevator;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.PixelHolder;

@Autonomous
public class Azules extends CommandOpMode {
    Intake intake;
    MecanumDriveSubsystem drive;
    SampleMecanumDrive sampleMecanumDrive;
    Elevator elevator;
    PixelHolder pixelHolder;
    AzulDer azulDer;
    AzulMid azulMid;
    AzulIzq azulIzq;


    @Override
    public void initialize() {
        intake = new Intake(telemetry, hardwareMap);
        sampleMecanumDrive = new SampleMecanumDrive(hardwareMap);
        drive = new MecanumDriveSubsystem(sampleMecanumDrive, false, false);
        pixelHolder = new PixelHolder(hardwareMap, telemetry);
        elevator = new Elevator(telemetry, hardwareMap);
        azulMid = new AzulMid(drive, elevator,intake,pixelHolder);
        //azulIzq = new AzulIzq(drive,elevator,intake,pixelHolder);
        //azulDer = new AzulDer(drive,elevator,intake,pixelHolder);

        schedule(azulMid);
    }
}
