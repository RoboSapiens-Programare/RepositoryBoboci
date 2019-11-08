package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp (name ="orice")
public class AlexiaCatalin_prototip extends RobotHardware {

    Servo servo1 = null;
    Servo servo2 = null;

    @Override
    public void runOpMode() throws InterruptedException {
        servo1 = hardwareMap.servo.get("ServoR");
        servo2 = hardwareMap.servo.get("ServoL");
        
        servo1.setDirection(Servo.Direction.FORWARD);
        servo2.setDirection(Servo.Direction.FORWARD);

        waitForStart();

        while (opModeIsActive()){
            if  (gamepad1.y){
                servo1.setPosition(0.5);
                servo2.setPosition(0.5);

            }
            if (gamepad2.x) {
                servo1.setPosition(0.0);
                servo2.setPosition(0.0);
            }
        }

    }

}
