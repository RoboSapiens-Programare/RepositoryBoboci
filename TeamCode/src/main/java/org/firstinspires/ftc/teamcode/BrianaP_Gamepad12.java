package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name = "B Gamepad12")
public class BrianaP_Gamepad12 extends RobotHardware {
    private ElapsedTime runtime=new ElapsedTime();
    public void runOpMode(){
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        //Initializez hardware ul
        Initialise();


        waitForStart();
        runtime.reset();
        while(opModeIsActive()){
            SetWheelsPower(-gamepad1.left_stick_y, -gamepad1.right_stick_y);
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.addData("Motors", "left (%.2f), right (%.2f)", -gamepad1.left_stick_y, -gamepad1.right_stick_y);
            telemetry.update();
        }
    }
}
