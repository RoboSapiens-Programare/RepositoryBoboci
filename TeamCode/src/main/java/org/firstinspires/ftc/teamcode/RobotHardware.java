package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cColorSensor;
import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cRangeSensor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.I2cAddr;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcore.external.navigation.Orientation;

public abstract class RobotHardware extends LinearOpMode {

    //Motors
    protected DcMotor MotorFR = null;
    protected DcMotor MotorFL = null;
    protected DcMotor MotorBR = null;
    protected DcMotor MotorBL = null;
    protected DcMotor MotorBratColectare = null;

    //Servos
    protected Servo ServoBrat = null;
    protected CRServo ServoYAxis = null;
    protected Servo ServoZAxis = null;
    protected Servo ServoClampLeft = null;
    protected Servo ServoClampRight = null;

    //Sensors
    protected ModernRoboticsI2cRangeSensor RangeL = null;
    protected ModernRoboticsI2cRangeSensor RangeR = null;
    protected ModernRoboticsI2cColorSensor ColorSide = null;
    protected ModernRoboticsI2cColorSensor ColorUnderneath = null;

    //Gyro
    protected BNO055IMU Gyro = null;

    //Global Variables
    Orientation lastAngles = new Orientation();
    double globalAngle;
    static double FRBLResult;
    static double FLBRResult;


    public void initialize(){
        MotorFR = hardwareMap.dcMotor.get("MotorFR");
        MotorFL = hardwareMap.dcMotor.get("MotorFL");
        MotorBR = hardwareMap.dcMotor.get("MotorBR");
        MotorBL = hardwareMap.dcMotor.get("MotorBL");

        MotorFR.setDirection(DcMotorSimple.Direction.FORWARD);
        MotorBR.setDirection(DcMotorSimple.Direction.FORWARD);
        MotorFL.setDirection(DcMotorSimple.Direction.REVERSE);
        MotorBL.setDirection(DcMotorSimple.Direction.REVERSE);

        MotorFR.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        MotorFL.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        MotorBR.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        MotorBL.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        MotorFR.setPower(0);
        MotorFL.setPower(0);
        MotorBR.setPower(0);
        MotorBL.setPower(0);

        MotorFR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        MotorFL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        MotorBR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        MotorBL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        //Brat Colectare
        MotorBratColectare = hardwareMap.dcMotor.get("MotorBrat");
        MotorBratColectare.setPower(0);
        MotorBratColectare.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        MotorBratColectare.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        MotorBratColectare.setDirection(DcMotorSimple.Direction.FORWARD);

        ServoYAxis = hardwareMap.crservo.get("ServoYAxis");
        ServoYAxis.setPower(0.0);


        ServoZAxis = hardwareMap.servo.get("ServoZAxis");
        ServoZAxis.setPosition(0.5);

        ServoClampLeft = hardwareMap.servo.get("ServoClampLeft");
        ServoClampLeft.setPosition(0.4);

        ServoClampRight = hardwareMap.servo.get("ServoClampRight");
        ServoClampRight.setPosition(0.4);


        RangeL = hardwareMap.get(ModernRoboticsI2cRangeSensor.class, "RangeL");
        RangeL.setI2cAddress(I2cAddr.create8bit(0x2c));
        RangeL.enableLed(true);
        RangeR = hardwareMap.get(ModernRoboticsI2cRangeSensor.class, "RangeR");
        RangeR.setI2cAddress(I2cAddr.create8bit(0x2e));
        RangeR.enableLed(true);

        ColorSide = hardwareMap.get(ModernRoboticsI2cColorSensor.class, "ColorSide");
        ColorSide.enableLed(true);
        ColorUnderneath = hardwareMap.get(ModernRoboticsI2cColorSensor.class, "ColorUnderneath");
        ColorUnderneath.enableLed(true);

        ServoBrat = hardwareMap.servo.get("ServoBrat");
        ServoBrat.setPosition(1);

        Gyro = hardwareMap.get(BNO055IMU.class, "imu");


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
