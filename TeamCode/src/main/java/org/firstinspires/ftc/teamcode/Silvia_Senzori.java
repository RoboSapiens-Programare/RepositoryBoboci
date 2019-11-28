package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cGyro;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.GyroSensor;

@Autonomous(name = "Test Senzori")
public class Silvia_Senzori extends RobotHardware {
    ModernRoboticsI2cGyro gyro = null;
    @Override
    public void runOpMode() throws InterruptedException{
        gyro = hardwareMap.get(ModernRoboticsI2cGyro.class, "Gyroscop");
        gyro.calibrate();
        waitForStart();
        while(opModeIsActive()){
            telemetry.addData("Gyroscop",gyro.getHeading());
            //telemetry.addData("Gyroscop",gyro.);
            telemetry.update();
        }
    }
}
