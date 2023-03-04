package Bai1;

public class Cylinder extends Circle  {
    public double height;

    public Cylinder(){

    }
    public Cylinder(double radius , String color , double height){
        this.radius = radius;
        this.color = color;
        this.height = height;
    }


    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }
    
    public double getVolume(){
        return getArea() * height;
    }
}

