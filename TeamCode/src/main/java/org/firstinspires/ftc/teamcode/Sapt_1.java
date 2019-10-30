package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Sapt_1")
public class Sapt_1 extends LinearOpMode {

    DcMotor motor1 = null;
    Servo servo1 = null;
    static final double speed = 0.3;

    @Override
    public void runOpMode() throws InterruptedException {
        //mapare

        motor1 =hardwareMap.dcMotor.get("motor1");
        servo1 = hardwareMap.servo.get("servo1");

        motor1.setDirection(DcMotorSimple.Direction.FORWARD);
        servo1.setDirection(Servo.Direction.FORWARD);

        motor1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        waitForStart();

        motor1.setPower(0.5);
        servo1.setPosition(0.6);


        sleep(10000);

        
    }
}
