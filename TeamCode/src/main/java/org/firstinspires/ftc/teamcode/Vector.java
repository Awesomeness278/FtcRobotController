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
    public float dotProduct(Vector v2){
        return v2.x*this.x + v2.y*this.y + v2.z*this.z;
    }
    public double magnitude(){
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2)+Math.pow(this.z,2));
    }
}
