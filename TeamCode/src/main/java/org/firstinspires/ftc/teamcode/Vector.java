package org.firstinspires.ftc.teamcode;

public class Vector {
    public float x;
    public float y;
    public float z;
    public Vector(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector(float x, float y){
        this.x = x;
        this.y = y;
        this.z = 0;
    }
}
