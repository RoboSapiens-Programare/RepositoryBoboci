package org.firstinspires.ftc.teamcode;

public final class Rares extends RobotHardware {

    @Override
    public void runOpMode() throws InterruptedException {
        initialise();

        waitForStart();

        while(opModeIsActive()) {
            setPowerLeft();
            setPowerRight();
        }
    }
}
