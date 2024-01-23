package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Escalador extends SubsystemBase {
    DcMotorEx escalador;
    Telemetry telemetry;
    HardwareMap hardwareMap;

    public Escalador(HardwareMap hardwareMap, Telemetry telemetry){
        this.hardwareMap = hardwareMap;
        this.telemetry = telemetry;

        //0
        escalador = hardwareMap.get(DcMotorEx.class, "escalador");
        escalador.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        escalador.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

    }

    public void setPosition(int pos){
        escalador.setPower(1);
        escalador.setTargetPosition(pos);
        escalador.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }



    public void setPower(double power){
        escalador.setPower(power);
    }

    public boolean isAtSetpoint() {
        boolean isAtPosition = escalador.getCurrentPosition() - escalador.getTargetPosition() < escalador.getTargetPositionTolerance();
        return isAtPosition;
    }

    @Override
    public void periodic(){
        telemetry.addData("Escalador: ", escalador.getCurrentPosition());
    }
}
