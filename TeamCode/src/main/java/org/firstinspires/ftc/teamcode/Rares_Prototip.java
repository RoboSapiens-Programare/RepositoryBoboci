package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Rares_Prototip")
public final class Rares_Prototip extends LinearOpMode {
    Servo ServoL = null;
    Servo ServoR = null;


    @Override
    public void runOpMode() throws InterruptedException {
        ServoR = hardwareMap.servo.get("ServoR");
        ServoL = hardwareMap.servo.get("ServoL");

        ServoR.setDirection(Servo.Direction.FORWARD);
        ServoL.setDirection(Servo.Direction.FORWARD);

        waitForStart();

        while(opModeIsActive()) {
            if(gamepad1.x) {
                ServoL.setPosition(0.50);
                ServoR.setPosition(0.30);
            } else if(gamepad1.y) {
                ServoL.setPosition(0);
                ServoR.setPosition(0);
            }

        }


    }
}
