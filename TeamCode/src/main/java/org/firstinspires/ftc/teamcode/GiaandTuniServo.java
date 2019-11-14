package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class GiaandTuniServo extends LinearOpMode {


        Servo servo1;
        Servo servo2;
        Servo servo3;
        Servo servo4;

        @Override
        public void runOpMode() {
            servo1 = hardwareMap.servo.get("ServoL");
            servo2 = hardwareMap.servo.get("ServoR");
            servo3 = hardwareMap.servo.get("ServoYAxis");
            servo4 = hardwareMap.servo.get("ServoZAxis");
            servo1.setDirection(Servo.Direction.FORWARD);
            servo2.setDirection(Servo.Direction.FORWARD);
            servo3.setDirection(Servo.Direction.FORWARD);
            servo4.setDirection(Servo.Direction.FORWARD);

            waitForStart();

            while (opModeIsActive()) {
                if (gamepad1.x) {
                    servo1.setPosition(0.0);
                    servo2.setPosition(0.0);
                }
                if (gamepad1.y) {
                    servo1.setPosition(0.5);
                    servo2.setPosition(0.4);
                }
                if (gamepad2.a) {
                    servo3.setPosition(0.0);
                }
                if (gamepad1.b) {
                    servo4.setPosition(0.0);
                }
                if (gamepad1.dpad_up) {
                    servo3.setPosition(0.4);
                }
                if (gamepad1.dpad_down) {
                    servo3.setPosition(0.7);
                }
                if (gamepad1.dpad_right) {
                    servo4.setPosition(0.2);
                }
                if (gamepad1.dpad_left) {
                    servo4.setPosition(0.6);
                }


            }

        }

}



