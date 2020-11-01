package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class shooter extends LinearOpMode {
    double angle = 37.5;
    double velocity;
    double g = 32.2;
    @Override
    public void runOpMode(){
        waitForStart();
        while(opModeIsActive()) {
            double h = ((35.5/12) - (11f/12f));
            double d = getDistance(12,35);
            double b = -Math.tan(Math.toRadians(angle));
            double at = (h-(b*d))/(d*d);
            velocity = Math.sqrt(-(g)/(2*Math.pow(Math.cos(Math.toRadians(angle)),2)*at));
            telemetry.addData("velocity",velocity);
            telemetry.update();
        }
    }
    double getDistance(double x,double y){
        //double rx = Odometry.getPositionX();
        //double ry = Odometry.getPositionY();
        //double dist = Math.sqrt(Math.pow(x-rx,2)+Math.pow(y-ry,2));
        //return dist;
        return 16f/3f;
    }
}
