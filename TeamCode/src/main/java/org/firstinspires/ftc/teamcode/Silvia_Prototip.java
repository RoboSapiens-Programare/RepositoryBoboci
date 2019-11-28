package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
@TeleOp(name="Silvia Prototip")
public class Silvia_Prototip extends LinearOpMode {
    Servo servo1=null;
    Servo servo2=null;
    Servo servo3=null;
    Servo servo4=null;
    @Override
    public void runOpMode() throws InterruptedException {
        servo1= hardwareMap.servo.get("ServoR");
        servo2= hardwareMap.servo.get("ServoL");
        servo3= hardwareMap.servo.get("ServoYAxis");
        servo4= hardwareMap.servo.get("ServoZAxis");
        servo1.setDirection(Servo.Direction.FORWARD);
        servo2.setDirection(Servo.Direction.FORWARD);
        servo3.setDirection(Servo.Direction.FORWARD);
        servo4.setDirection(Servo.Direction.FORWARD);
        waitForStart();
        while(opModeIsActive()) {
            if(gamepad1.x){
                servo1.setPosition(0.6);
                servo2.setPosition(0.6);
            }
            if(gamepad1.a){
                servo1.setPosition(0);
                servo2.setPosition(0);
            }
            if(gamepad1.b){
                servo3.setPosition(0.5);
            }
            if(gamepad1.y){
                servo3.setPosition(0);
            }
            if(gamepad1.dpad_right){
                servo4.setPosition(0.7);
            }
            if(gamepad1.dpad_left){
                servo4.setPosition(0);
            }
        }
    }
}
