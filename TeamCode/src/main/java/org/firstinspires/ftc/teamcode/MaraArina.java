package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp(name = "Servo MaraArina")
public class MaraArina extends LinearOpMode {
    Servo s1 = null;
    Servo s2 = null;
    Servo s3 = null;
    Servo s4 = null;
    public void runOpMode (){

        s1 = hardwareMap.servo.get("ServoR");
        s2 = hardwareMap.servo.get("ServoL");
        s1.setDirection(Servo.Direction.FORWARD);
        s2.setDirection(Servo.Direction.FORWARD);
        s3 = hardwareMap.servo.get("ServoYAxis");
        s4 = hardwareMap.servo.get("ServoZAxis");
        s3.setDirection(Servo.Direction.FORWARD);
        s4.setDirection(Servo.Direction.FORWARD);

        waitForStart();

        while(opModeIsActive()){
            if(gamepad1.x){
                s1.setPosition(0);
                s2.setPosition(0);
            }
            else if(gamepad1.b){
                s1.setPosition(0.7);
                s2.setPosition(0.5);
            }
            if(gamepad1.dpad_up)
                s3.setPosition(0.4);
            else if(gamepad1.dpad_down)
                s3.setPosition(0.9);

            if(gamepad1.dpad_right)
                s4.setPosition(0);
            else if(gamepad1.dpad_left)
                s4.setPosition(0.8);
        }

    }
}
