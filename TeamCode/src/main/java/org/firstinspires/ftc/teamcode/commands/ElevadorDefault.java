package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.WaitCommand;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.subsystems.Elevator;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.PixelHolder;

public class ElevadorDefault extends CommandBase {
    Elevator elevator;
    GamepadEx gamepad;
    Intake intake;
    PixelHolder pixelHolder;

    public ElevadorDefault(Elevator elevator, GamepadEx gamepad, PixelHolder pixelHolder, Intake intake){
        this.elevator = elevator;
        this.gamepad = gamepad;
        this.pixelHolder = pixelHolder;
        this.intake = intake;

        addRequirements(elevator);
    }

    @Override
    public void execute() {
        //Por poder
        /*
        if(gamepad.getTrigger(GamepadKeys.Trigger.RIGHT_TRIGGER) > .9){
            elevator.setPower(1);
        }else if(gamepad.getTrigger(GamepadKeys.Trigger.RIGHT_TRIGGER) > 0){
            elevator.setPower(0);
        }
        if (gamepad.getTrigger(GamepadKeys.Trigger.LEFT_TRIGGER) > .9){
            elevator.setPower(-1);
        }else if(gamepad.getTrigger(GamepadKeys.Trigger.LEFT_TRIGGER) > 0){
            elevator.setPower(0);
        }
         */


        //Por posiciones
        if(gamepad.getTrigger(GamepadKeys.Trigger.RIGHT_TRIGGER) > .5){
            CommandScheduler.getInstance().schedule(new InstantCommand(pixelHolder::elevator));
            CommandScheduler.getInstance().schedule(new WaitCommand(100));
            CommandScheduler.getInstance().schedule(new ElevadorGoToPosition(elevator, 2100));
        }


        if(elevator.getPosition() > 2000){
            CommandScheduler.getInstance().schedule(new InstantCommand(pixelHolder::leave));
        }



        if(elevator.getPosition() < 0){
            CommandScheduler.getInstance().schedule(new InstantCommand(pixelHolder::grab));
        }




        if (gamepad.getTrigger(GamepadKeys.Trigger.LEFT_TRIGGER) > .5){
            CommandScheduler.getInstance().schedule(new InstantCommand(pixelHolder::elevator));
            CommandScheduler.getInstance().schedule(new WaitCommand(100));
            CommandScheduler.getInstance().schedule(new ElevadorGoToPosition(elevator, 0));
            CommandScheduler.getInstance().schedule(new WaitCommand(100));
            CommandScheduler.getInstance().schedule(new InstantCommand(intake::abajo));
            //CommandScheduler.getInstance().schedule(new InstantCommand(pixelHolder::grab));
        }





    }
}
