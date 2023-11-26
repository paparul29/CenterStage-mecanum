package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.subsystems.Elevator;

public class ElevadorGoToPosition extends CommandBase {
    Elevator elevator;
    int setPoint;

    public ElevadorGoToPosition(Elevator elevator, int setPoint){
        this.elevator = elevator;
        this.setPoint = setPoint;

        addRequirements(elevator);
    }

    @Override
    public void execute() {
        elevator.setPosition(1, setPoint);
    }

    @Override
    public boolean isFinished() {
        return elevator.isAtSetpoint();
    }


}
