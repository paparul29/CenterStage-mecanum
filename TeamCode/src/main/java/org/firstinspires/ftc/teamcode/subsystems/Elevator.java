package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Elevator extends SubsystemBase {

    DcMotorEx elevadorizq, elevadorder;
    Telemetry telemetry;
    HardwareMap hardwareMap;

    public Elevator(Telemetry telemetry, HardwareMap hardwareMap) {
        //3
        elevadorizq = hardwareMap.get(DcMotorEx.class, "elevadorizq");
        //2
        elevadorder = hardwareMap.get(DcMotorEx.class, "elevadorder");

        this.telemetry = telemetry;
        this.hardwareMap = hardwareMap;

        elevadorizq.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        elevadorder.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //elevadorizq.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        elevadorizq.setDirection(DcMotorSimple.Direction.REVERSE);
        //elevadorder.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //elevadorder.setDirection(DcMotorSimple.Direction.REVERSE);
    }


    public void setPosition(double power, int pos) {
        elevadorizq.setTargetPosition(pos);
        elevadorder.setTargetPosition(pos);
        elevadorizq.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        elevadorder.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        elevadorizq.setPower(power);
        elevadorder.setPower(power);
    }

    public int getPosition(){
        return elevadorizq.getCurrentPosition()+elevadorder.getCurrentPosition();
    }

    public void setPower(double power){
        elevadorizq.setPower(power);
    }

    public boolean isAtSetpoint(){
        boolean isAtPosition = elevadorizq.getCurrentPosition() - elevadorizq.getTargetPosition() < elevadorizq.getTargetPositionTolerance();
        return  isAtPosition;
    }

    @Override
    public void periodic(){
        telemetry.addData("Elevador: ", elevadorizq.getVelocity());
    }



}