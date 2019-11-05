package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Task_Sapt_3 extends LinearOpMode {
    //Declarare Hardware (momentan doar motoare)
    DcMotor MotorFR = null; //front right
    DcMotor MotorFL = null; //front left
    DcMotor MotorBR = null; //back right
    DcMotor MotorBL = null; //back left

    //Constanta pentru deadzone
    final double deadzone = 0.1;

    @Override
    public void runOpMode() throws InterruptedException {
        //Initializare hardware
        MotorFR = hardwareMap.dcMotor.get("motorFR");
        MotorFL = hardwareMap.dcMotor.get("motorFL");
        MotorBR = hardwareMap.dcMotor.get("motorBR");
        MotorBL = hardwareMap.dcMotor.get("motorBL");

        MotorFR.setDirection(DcMotorSimple.Direction.FORWARD);
        MotorBR.setDirection(DcMotorSimple.Direction.FORWARD);
        MotorFL.setDirection(DcMotorSimple.Direction.REVERSE);
        MotorBL.setDirection(DcMotorSimple.Direction.REVERSE);

        MotorFR.setPower(0);
        MotorBR.setPower(0);
        MotorFL.setPower(0);
        MotorBL.setPower(0);

        //Asteptam start
        waitForStart();

        while(opModeIsActive()){

            //Daca left stick-ul a fost miscat mai mult decat deadzone-ul
            if(Math.abs(gamepad1.left_stick_y) > deadzone) {
                //Setam puterea motoarelor sa fie inversul stick ului (pe joystick uri, y-ul este -1 sus si 1 jos)
                MotorFL.setPower(-gamepad1.left_stick_y);
                MotorBL.setPower(-gamepad1.left_stick_y);
            }
            else {
                //Daca nu, setam puterea la 0
                MotorFL.setPower(0);
                MotorBL.setPower(0);
            }

            //Analog si pentru celalalt stick
            if(Math.abs(gamepad1.right_stick_y) > deadzone) {
                MotorFR.setPower(-gamepad1.right_stick_y);
                MotorBR.setPower(-gamepad1.right_stick_y);
            }
            else {
                MotorFR.setPower(0);
                MotorBR.setPower(0);
            }
        }

    }
}
