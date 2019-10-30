package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;

public abstract class RobotHardware extends LinearOpMode {
    DcMotor motorSS = null;
    DcMotor motorSJ = null;
    DcMotor motorDS = null;
    DcMotor motorDJ = null;

    public void initialise() {
        motorSS = hardwareMap.dcMotor.get("motorSS");
        motorSJ = hardwareMap.dcMotor.get("motorSJ");
        motorDS = hardwareMap.dcMotor.get("motorDS");
        motorDJ = hardwareMap.dcMotor.get("motorDJ");

        motorSS.setDirection(DcMotorSimple.Direction.FORWARD);
        motorSJ.setDirection(DcMotorSimple.Direction.FORWARD);
        motorDS.setDirection(DcMotorSimple.Direction.REVERSE);
        motorDJ.setDirection(DcMotorSimple.Direction.REVERSE);

    }

    public void setPowerLeft() {
        motorSS.setPower(Range.clip(gamepad1.left_stick_y, -0.7,0.7));
        motorSJ.setPower(Range.clip(gamepad1.left_stick_y, -0.7,0.7));
    }

    public void setPowerRight() {
        motorDS.setPower(Range.clip(gamepad1.right_stick_y, -0.7,0.7));
        motorDJ.setPower(Range.clip(gamepad1.right_stick_y, -0.7,0.7));
    }
}
