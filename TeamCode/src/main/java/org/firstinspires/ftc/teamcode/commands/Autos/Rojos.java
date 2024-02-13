package org.firstinspires.ftc.teamcode.commands.Autos;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Trayectories.FantasyRed;
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
    BuenosRojosMid buenosRojosMid;
    BuenosRojosIzq buenosRojosIzq;
    BuenosRojosDer buenosRojosDer;

    RedFantasy redFantasy;

    @Override
    public void initialize() {
        intake = new Intake(telemetry, hardwareMap);
        sampleMecanumDrive = new SampleMecanumDrive(hardwareMap);
        drive = new MecanumDriveSubsystem(sampleMecanumDrive, false, false);
        pixelHolder = new PixelHolder(hardwareMap, telemetry);
        elevator = new Elevator(telemetry, hardwareMap);
        //rojoIzq = new RojoIzq(drive, elevator, intake, pixelHolder);
        //rojoDer = new RojoDer(drive,elevator,intake,pixelHolder);
        //rojoMid = new RojoMid(drive,elevator,intake,pixelHolder);
        redFantasy = new RedFantasy(drive);
        //buenosRojosIzq = new BuenosRojosIzq(drive,elevator,intake,pixelHolder);
        //buenosRojosMid = new BuenosRojosMid(drive, elevator, intake, pixelHolder);
        buenosRojosDer = new BuenosRojosDer(drive, elevator, intake, pixelHolder);
        schedule(buenosRojosDer);

    }
}