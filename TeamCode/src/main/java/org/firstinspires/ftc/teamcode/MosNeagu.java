package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

public class MosNeagu extends RobotHardware{

    static final double DEADZONE = 0.1;

    Servo ServoR = null;
    Servo ServoL = null;

    @Override
    public void initialise(){
        super.initialise();
        ServoR = hardwareMap.servo.get("ServoR");
        ServoL = hardwareMap.servo.get("ServoL");
        ServoR.setDirection(Servo.Direction.FORWARD);
        ServoL.setDirection(Servo.Direction.REVERSE);
    }

    public void runOpMode(){
        waitForStart();
        initialise();

        while (opModeIsActive()){
            Gamepad1();
        }
    }

    public double power(double power){
        if (Math.abs(power) > DEADZONE)
            return power;
        return 0F;
    }

    public void Gamepad1(){
        if (power(gamepad1.right_stick_x) != 0 || power(gamepad1.left_stick_x) != 0)
            SetWheelsPower(power(gamepad1.right_stick_x), power(gamepad1.left_stick_x));
        else
            StopWheels();

        // SetWheelsPower(power(gamepad1.right_stick_x), power(gamepad1.left_stick_x));

        if (gamepad1.x){
            ServoL.setPosition(0.5);
            ServoR.setPosition(0.5);
        }

        if (gamepad1.y){
            ServoL.setPosition(0);
            ServoR.setPosition(0);
        }
    }
}
