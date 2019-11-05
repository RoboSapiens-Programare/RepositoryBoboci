package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Rares")
public final class Rares extends RobotHardware {

    static final double DEADZONE = 0.1;


    @Override
    public void runOpMode() throws InterruptedException {
        Initialise();

        waitForStart();

        while(opModeIsActive()) {
            Gamepad1();

        }
    }

    private void Gamepad1(){
        if(Math.abs(gamepad1.left_stick_y) > DEADZONE || Math.abs(gamepad1.right_stick_y) > DEADZONE){
            SetWheelsPower(gamepad1.left_stick_y, gamepad1.right_stick_y);
        }else{
            StopWheels();
        }

    }
}
