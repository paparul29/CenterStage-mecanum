package org.firstinspires.ftc.teamcode.opModes;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.RunCommand;
import com.arcrobotics.ftclib.command.button.GamepadButton;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.commands.ElevadorDefault;
import org.firstinspires.ftc.teamcode.commands.MecanumDriveCommand;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.Elevator;
import org.firstinspires.ftc.teamcode.subsystems.Escalador;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.PixelHolder;

public class TeleOpFCRojo extends CommandOpMode {

    @Override
    public void initialize() {
        SampleMecanumDrive sampleMecanumDrive = new SampleMecanumDrive(hardwareMap);
        MecanumDriveSubsystem driveSystem = new MecanumDriveSubsystem(sampleMecanumDrive, true, false);
        Intake intake = new Intake(telemetry, hardwareMap);
        Elevator elevator = new Elevator(telemetry, hardwareMap);
        PixelHolder pixelHolder = new PixelHolder(hardwareMap, telemetry);
        Escalador escalador = new Escalador(hardwareMap, telemetry);

        GamepadEx gamepadDriver = new GamepadEx(gamepad1);
        GamepadEx gamepadC = new GamepadEx(gamepad2);

        new GamepadButton(new GamepadEx(gamepad1), GamepadKeys.Button.LEFT_BUMPER)
                .whileHeld(() -> intake.setPower(1))
                .whenReleased(() -> intake.setPower(0));

        new GamepadButton(new GamepadEx(gamepad1), GamepadKeys.Button.RIGHT_BUMPER)
                .whileHeld(() -> intake.setPower(-1))
                .whenReleased(() -> intake.setPower(0));

        new GamepadButton(new GamepadEx(gamepad1), GamepadKeys.Button.DPAD_RIGHT)
                .whileHeld(() -> intake.setLaunch(1))
                .whenReleased(() -> intake.setLaunch(0));

        new GamepadButton(new GamepadEx(gamepad1), GamepadKeys.Button.DPAD_LEFT)
                .whileHeld(() -> intake.setLaunch(-1))
                .whenReleased(() -> intake.setLaunch(0));

        new GamepadButton(new GamepadEx(gamepad1), GamepadKeys.Button.Y)
                .whileHeld(() -> escalador.setPower(1))
                .whenReleased(() -> escalador.setPower(0));

        new GamepadButton(new GamepadEx(gamepad1), GamepadKeys.Button.A)
                .whileHeld(() -> escalador.setPower(-1))
                .whenReleased(() -> escalador.setPower(0));

        new GamepadButton(new GamepadEx(gamepad2), GamepadKeys.Button.Y)
                .whenPressed(() -> elevator.setPosition(1, 3500));

        new GamepadButton(new GamepadEx(gamepad2), GamepadKeys.Button.RIGHT_BUMPER)
                .whenPressed(()-> elevator.setPosition(1,2700));

        elevator.setDefaultCommand(new ElevadorDefault(elevator, gamepadC, pixelHolder));

        new GamepadButton(new GamepadEx(gamepad2), GamepadKeys.Button.B)
                .toggleWhenPressed(()-> pixelHolder.hold(), ()-> pixelHolder.soltar());

        new GamepadButton(new GamepadEx(gamepad2), GamepadKeys.Button.X)
                .toggleWhenPressed(()-> pixelHolder.pixel1Hold(), ()-> pixelHolder.pixel1Soltar());

        new GamepadButton(new GamepadEx(gamepad2), GamepadKeys.Button.A)
                .toggleWhenPressed(()-> pixelHolder.pixel2Hold(), ()-> pixelHolder.pixel2Soltar());

        new GamepadButton(new GamepadEx(gamepad2), GamepadKeys.Button.DPAD_UP)
                .whenPressed(()-> pixelHolder.leave());

        new GamepadButton(new GamepadEx(gamepad2), GamepadKeys.Button.DPAD_LEFT)
                .whenPressed(()-> pixelHolder.elevator());

        new GamepadButton(new GamepadEx(gamepad2), GamepadKeys.Button.DPAD_DOWN)
                .whenPressed(()-> pixelHolder.grab());





        gamepadDriver.getGamepadButton(GamepadKeys.Button.RIGHT_STICK_BUTTON)
                .whenPressed(new InstantCommand(driveSystem::toggleInverted));

        driveSystem.setDefaultCommand(new MecanumDriveCommand(
                driveSystem, () -> -gamepadDriver.getLeftY(), gamepadDriver::getLeftX, gamepadDriver::getRightX
        ));

        schedule(new RunCommand(() -> {
            driveSystem.update();
            telemetry.addData("Heading", driveSystem.getPoseEstimate().getHeading());
            telemetry.update();
        }));

    }
}
