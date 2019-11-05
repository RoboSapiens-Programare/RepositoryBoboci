package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Rares")
public final class Rares extends RobotHardware {

    static final double DEADZONE = 0.1;

    Servo ServoL = null;
    Servo ServoR = null;


    @Override
    public void runOpMode() throws InterruptedException {
        ServoR = hardwareMap.servo.get("ServoR");
        ServoL = hardwareMap.servo.get("ServoL");

        ServoR.setDirection(Servo.Direction.FORWARD);
        ServoL.setDirection(Servo.Direction.REVERSE);



        initialise();

        waitForStart();

        while(opModeIsActive()) {
            Gamepad1();

        }
    }

    protected void SetServoAngle(boolean button) {
        if(button == gamepad1.x) {
            ServoL.setPosition(0.55);
            ServoR.setPosition(0.55);
        } else if(button == gamepad1.y) {
            ServoL.setPosition(0);
            ServoR.setPosition(0);
        }
    }

    private void Gamepad1(){
        if(Math.abs(gamepad1.left_stick_y) > DEADZONE || Math.abs(gamepad1.right_stick_y) > DEADZONE){
            SetWheelsPower(gamepad1.left_stick_y, gamepad1.right_stick_y);
        }else{
            StopWheels();
        }

        if(gamepad1.x)
            SetServoAngle(gamepad1.x);
        else if(gamepad1.y)
            SetServoAngle(gamepad1.y);

    }
}
