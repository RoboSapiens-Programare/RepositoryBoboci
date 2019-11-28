package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cGyro;
import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cRangeSensor;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@Autonomous(name="Senzor")
public class BrianaP_Senzori extends LinearOpMode {

    ModernRoboticsI2cGyro G1;
    ModernRoboticsI2cRangeSensor R1;
    public void initi()
    {
        G1=hardwareMap.get(ModernRoboticsI2cGyro.class,"Gyroscop");
        R1=hardwareMap.get(ModernRoboticsI2cRangeSensor.class,"pangepoiana");
        G1.calibrate();
    }
    @Override
    public void runOpMode()
    {
        initi();
        waitForStart();
        telemetry.addData("Gyro=",G1.getHeading() );
        telemetry.addData("RangeSenzor",R1.getDistance(DistanceUnit.CM));
        telemetry.update();
    }
}
