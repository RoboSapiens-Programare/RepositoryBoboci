package org.firstinspires.ftc.teamcode;

public class Alexandra_Sasiu extends RobotHardware {

    static double DEADZONE = 0.1;


    @Override
    public void runOpMode() throws InterruptedException {
        while(opModeIsActive())
        {

            if (gamepad1.left_stick_y > DEADZONE && gamepad1.left_stick_y <= 0.7) {
                MotorFL.setPower(gamepad1.left_stick_y);
                MotorBL.setPower(gamepad1.left_stick_y);
            }
            if (gamepad1.right_stick_y > DEADZONE && gamepad1.right_stick_y <= 0.7) {
                MotorFR.setPower(gamepad1.right_stick_y);
                MotorBR.setPower(gamepad1.right_stick_y);
            }
            else {
                StopWheels();
            }
        }
    }



}
