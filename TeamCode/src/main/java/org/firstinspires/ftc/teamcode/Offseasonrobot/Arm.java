package org.firstinspires.ftc.teamcode.Offseasonrobot;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad2;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
//
@TeleOp(name = "Arm test")
public class Arm {
    private DcMotor arm;
    @Override
    public void runOpMode() {

        arm = hardwareMap.get(DcMotor.class "arm");
        arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        waitForStart();
        while (opModeIsActive()) {
            //left stick controls the arm
            double armPower = -gamepad2.left_stick_y;
arm.setPower(armPower);
telemetry.addData("Arm Position", arm.getCurrentPosition());
telemetry.update();
}
}
}
