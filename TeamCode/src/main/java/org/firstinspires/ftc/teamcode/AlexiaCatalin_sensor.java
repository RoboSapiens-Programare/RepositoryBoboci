package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cGyro;
import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cRangeSensor;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@Autonomous (name = "sensorii")
public class AlexiaCatalin_sensor extends RobotHardware {

    ModernRoboticsI2cRangeSensor Sensor1 = null;
    ModernRoboticsI2cGyro Gyro1 = null;
    @Override
    public void runOpMode() throws InterruptedException {

        Sensor1 = hardwareMap.get(ModernRoboticsI2cRangeSensor.class,"rangepoiana");
        Gyro1 = hardwareMap.get(ModernRoboticsI2cGyro.class,"Gyroscop");

        Gyro1.calibrate();

        while (Gyro1.isCalibrating()){
            telemetry.addData("Gyroul se calibreaza",' ');
        }
        telemetry.update();

        waitForStart();

        while (opModeIsActive()){

            telemetry.addData("Senzorul de range are valoarea", Sensor1.getDistance(DistanceUnit.CM));
            telemetry.addData("Gyro are valoarea",Gyro1.getIntegratedZValue());
            telemetry.update();


        }
    }
}
