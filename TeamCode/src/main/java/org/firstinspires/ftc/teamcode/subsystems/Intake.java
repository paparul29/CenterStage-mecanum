package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

public class Intake extends SubsystemBase {
    DcMotorEx intake;
    HardwareMap hardwareMap;
    Telemetry telemetry;
    CRServo avion;
    ServoEx topple;


    public Intake(Telemetry telemetry, HardwareMap hardwareMap){
        this.hardwareMap = hardwareMap;
        this.telemetry = telemetry;
        //1
        intake = hardwareMap.get(DcMotorEx.class, "Intake");
        intake.setDirection(DcMotorSimple.Direction.REVERSE);
        //puerto 4
        topple = new SimpleServo(hardwareMap, "topple", 0, 180, AngleUnit.DEGREES);


        init();

    }

    public void setPower(double power){
        intake.setPower(power);
    }
    public void setLaunch(double power){
        avion.setPower(power);
    }

    public void abajo(){
        topple.turnToAngle(147);
    }

    public void init(){
        topple.turnToAngle(80);
    }

    public void arriba(){
        topple.turnToAngle(100);
    }

    public void masAbajo(){
        topple.turnToAngle(142);
    }


}
