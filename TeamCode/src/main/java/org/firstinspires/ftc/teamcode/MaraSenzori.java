package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cGyro;
import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cRangeSensor;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@Autonomous(name = "gyrange")

public class MaraSenzori extends LinearOpMode {
    ModernRoboticsI2cGyro g = null;
    ModernRoboticsI2cRangeSensor r = null;

    @Override
    public void runOpMode(){
        g = hardwareMap.get(ModernRoboticsI2cGyro.class, "Gyroscop");
        r = hardwareMap.get(ModernRoboticsI2cRangeSensor.class, "rangepoiana");
        g.calibrate();
        waitForStart();
        while(opModeIsActive()){
            telemetry.addData("gyro: ", g.getHeading());
            telemetry.addData("range: ", r.getDistance(DistanceUnit.CM));
            telemetry.update();
        }

    }
}

