package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.SensorDistance;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class Intake extends SubsystemBase {
    DcMotorEx intake;
    HardwareMap hardwareMap;
    Telemetry telemetry;
    ServoEx avion;
    ServoEx topple;
    //SensorDistance sensorArriba, sensorAbajo;


    public Intake(Telemetry telemetry, HardwareMap hardwareMap){
        this.hardwareMap = hardwareMap;
        this.telemetry = telemetry;
        //1
        intake = hardwareMap.get(DcMotorEx.class, "Intake");
        intake.setDirection(DcMotorSimple.Direction.REVERSE);
        avion = new SimpleServo(hardwareMap, "avion", 0, 180, AngleUnit.DEGREES);
        //puerto 4
        topple = new SimpleServo(hardwareMap, "topple", 0, 180, AngleUnit.DEGREES);
        //sensorArriba = hardwareMap.get(SensorDistance.class,"sensor2");
        //sensorAbajo = hardwareMap.get(SensorDistance.class,"sensor1");

    }

    public void setPower(double power){
        intake.setPower(power);
    }

    //public void letItFly(){avion.turnToAngle(45);}
    //public void midClose(){avion.turnToAngle(70);}
    //public void close(){avion.turnToAngle(40);}

    public void letItFly(){avion.setPosition(1);}
    public void midClose(){avion.setPosition(.4);}
    public void close(){avion.setPosition(0);}


    public void abajo(){
        topple.turnToAngle(134);
    } //primeros2

    public void arriba(){topple.turnToAngle(68);}

    public void trans(){topple.turnToAngle(118);}

    public void masAbajo(){
        topple.turnToAngle(142);
    }//los otros3


    /*public boolean grabPixel1S(){
        return sensorAbajo.getDistance(DistanceUnit.MM) < 9;
    }
    public boolean grabPixel2S(){
        return sensorArriba.getDistance(DistanceUnit.MM) < 9;
    }

    public void periodic() {
        telemetry.addData("Pixel 1: ", grabPixel1S());
        telemetry.addData("Pixel 2:", grabPixel2S());

    }

     */
    }



