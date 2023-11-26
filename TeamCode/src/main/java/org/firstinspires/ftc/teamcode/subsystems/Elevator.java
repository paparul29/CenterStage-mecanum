package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Elevator extends SubsystemBase {

    DcMotorEx elevador;
    Telemetry telemetry;
    HardwareMap hardwareMap;

    public Elevator(Telemetry telemetry, HardwareMap hardwareMap) {
        elevador = hardwareMap.get(DcMotorEx.class, "elevador");
        this.telemetry = telemetry;
        this.hardwareMap = hardwareMap;

        elevador.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        elevador.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        elevador.setDirection(DcMotorSimple.Direction.FORWARD);
    }


    public void setPosition(double power, int pos) {
        elevador.setTargetPosition(pos);
        elevador.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        elevador.setPower(power);
    }

    public int getPosition(){
        return elevador.getCurrentPosition();
    }

    public void setPower(double power){
        elevador.setPower(power);
    }

    public boolean isAtSetpoint(){
        boolean isAtPosition = elevador.getCurrentPosition() - elevador.getTargetPosition() < elevador.getTargetPositionTolerance();
        return  isAtPosition;
    }

    @Override
    public void periodic(){
       telemetry.addData("Elevador: ", elevador.getCurrentPosition());
    }



}
