package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "BrianaN")
public class MosNeagu_Servo extends LinearOpMode {

    static final double DEADZONE = 0.1;

    Servo ServoR = null;
    Servo ServoL = null;

    public void initialise(){
        ServoR = hardwareMap.servo.get("ServoR");
        ServoL = hardwareMap.servo.get("ServoL");
        ServoR.setDirection(Servo.Direction.FORWARD);
        ServoL.setDirection(Servo.Direction.FORWARD);
    }

    public void runOpMode(){
        waitForStart();
        initialise();

        while (opModeIsActive()){
            Gamepad1();
        }
    }

    public void Gamepad1(){
        if (gamepad1.x){
            ServoL.setPosition(0.50);
            ServoR.setPosition(0.30);
        }

        if (gamepad1.y){
            ServoL.setPosition(0);
            ServoR.setPosition(0);
        }
    }
}
