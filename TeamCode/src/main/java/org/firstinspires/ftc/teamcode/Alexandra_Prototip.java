package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp (name = "Alexandra Prototip")
public class Alexandra_Prototip extends LinearOpMode {

    Servo servo1 = null;
    Servo servo2 = null;

    @Override
    public void runOpMode() throws InterruptedException {
        servo1 = hardwareMap.servo.get("ServoR");
        servo2 = hardwareMap.servo.get("ServoL");
        servo1.setDirection(Servo.Direction.FORWARD);
        servo2.setDirection(Servo.Direction.FORWARD);
        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.a) {
                servo1.setPosition(0.7);
                servo2.setPosition(0.7);
            }
            if (gamepad1.b) {
                servo1.setPosition(0);
                servo2.setPosition(0);
            }
        }
    }
}

