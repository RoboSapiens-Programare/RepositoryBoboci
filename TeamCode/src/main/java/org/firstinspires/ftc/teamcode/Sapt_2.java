package org.firstinspires.ftc.teamcode;

import android.renderscript.ScriptGroup;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

public class Sapt_2 extends LinearOpMode {
    DcMotor motor1 = null;
    Servo servo1 = null;
    static final double speed = 0.3;

    @Override
    public void runOpMode() throws InterruptedException {
        motor1 =hardwareMap.dcMotor.get("motor1");
        servo1 = hardwareMap.servo.get("servo1");

        motor1.setDirection(DcMotorSimple.Direction.FORWARD);
        servo1.setDirection(Servo.Direction.FORWARD);

        motor1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        waitForStart();

        while(opModeIsActive()){

            if (gamepad1.y) servo1.setPosition(0.5);
            else if (gamepad1.x) {
                servo1.setPosition(1);
            }

            if (gamepad1.left_stick_y != 0 ) {
                motor1.setPower(Range.clip(gamepad1.left_stick_y, -0.7, 0.7));
            }

        }
    }
}
