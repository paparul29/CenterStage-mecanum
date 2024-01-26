package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

public class PixelHolder extends SubsystemBase {
    ServoEx pixel1, pixel2, pixelHolderIzq, pixelHolderDer;
    Telemetry telemetry;
    HardwareMap hardwareMap;

    public PixelHolder(HardwareMap hardwareMap, Telemetry telemetry){
        this.hardwareMap = hardwareMap;
        this.telemetry = telemetry;

        pixel1 = new SimpleServo(hardwareMap, "pixel1", 0, 180, AngleUnit.DEGREES);
        pixel2 = new SimpleServo(hardwareMap, "pixel2", 0, 180, AngleUnit.DEGREES);
        //amarillo puerto 2
        pixelHolderIzq = new SimpleServo(hardwareMap, "pixelH1", 0, 180, AngleUnit.DEGREES);
        //azul puerto 3
        pixelHolderDer = new SimpleServo(hardwareMap, "pixelH2", 0, 180, AngleUnit.DEGREES);
        pixel2.setInverted(false);
        pixelHolderDer.setInverted(true);

        pixel1Soltar();
        pixel2Hold();
        elevator();
    }

    public void hold(){
        pixel1.turnToAngle(0);
        pixel2.turnToAngle(0);
    }

    public void soltar(){
        pixel1.turnToAngle(35);
        pixel2.turnToAngle(40);
    }


    public void pixel1Soltar(){
        pixel1.turnToAngle(35);
    }

    public void pixel1Hold(){
        pixel1.turnToAngle(0);
    }


    //agarrar
    public void pixel2Soltar(){
        pixel2.turnToAngle(40);
    }

    //soltar
    public void pixel2Hold(){
        pixel2.turnToAngle(0);
    }

    //Dejar pixeles
    public void leave(){
        pixelHolderIzq.turnToAngle(50);
        pixelHolderDer.turnToAngle(50);
    }

    //Agarrar pixeles
    public void grab(){
        pixelHolderIzq.turnToAngle(124);
        pixelHolderDer.turnToAngle(124);
    }

    //para poder subir y bajar con el elevador
    public void elevator(){
        pixelHolderIzq.turnToAngle(155);
        pixelHolderDer.turnToAngle(155);
    }



}
