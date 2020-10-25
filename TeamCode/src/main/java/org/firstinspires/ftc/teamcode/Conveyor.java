package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class Conveyor extends LinearOpMode {
    Servo[] servos = new Servo[4];
    double dist = 0;
    boolean change = true;
    double power = 0.5;
    @Override
    public void runOpMode(){
        for(int i = 0; i < 4; i++) {
            servos[i] = hardwareMap.get(Servo.class, "Servo " + i);
        }
        servos[0].setDirection(Servo.Direction.REVERSE);
        servos[1].setDirection(Servo.Direction.REVERSE);
        waitForStart();
        while(opModeIsActive()){
            if (gamepad1.dpad_up && change) {
                power = power + 0.1;
                change = false;
            } else if (gamepad1.dpad_down && change) {
                power = power - 0.1;
                change = false;
            }else if(!gamepad1.dpad_up && !gamepad1.dpad_down){
                change = true;
            }
            dist += power;
            for(int i = 0; i < 4; i++){
                servos[i].setPosition(dist);
            }
            telemetry.addData("power",power);
            telemetry.update();
        }
    }
}
