package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;

public abstract class RobotHardware extends LinearOpMode {
    DcMotor MotorFL = null;
    DcMotor MotorBL = null;
    DcMotor MotorFR = null;
    DcMotor MotorBR = null;

    public void Initialise() {
        MotorFL = hardwareMap.dcMotor.get("MotorFL");
        MotorBL = hardwareMap.dcMotor.get("MotorBL");
        MotorFR = hardwareMap.dcMotor.get("MotorFR");
        MotorBR = hardwareMap.dcMotor.get("MotorBR");

        MotorFL.setDirection(DcMotorSimple.Direction.FORWARD);
        MotorBL.setDirection(DcMotorSimple.Direction.FORWARD);
        MotorFR.setDirection(DcMotorSimple.Direction.REVERSE);
        MotorBR.setDirection(DcMotorSimple.Direction.REVERSE);

        MotorFL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        MotorBL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        MotorFR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        MotorBR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }

    protected void SetWheelsPower(double speedL, double speedR){
        MotorFL.setPower(Range.clip(speedL, -0.7,0.7));
        MotorBL.setPower(Range.clip(speedL, -0.7,0.7));
        MotorFR.setPower(Range.clip(speedR, -0.7,0.7));
        MotorBR.setPower(Range.clip(speedR, -0.7,0.7));
    }

    protected void StopWheels(){
        SetWheelsPower(0,0);
    }
}
