package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class Alexandra_Prototip extends LinearOpMode {
    @Override
    Servo servo1 = null;
    Servo servo2 = null;

    public void runOpMode() throws InterruptedException {
        servo1 = hardwareMap.servo.get("servo1");
        servo2 = hardwareMap.servo.get("servo2");
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

