package Bai1;

public class Circle {
    public double radius ;
    public String color ;

    public Circle(){

    }
    public Circle(double radius , String color){
        this.radius = radius ;
        this.color = color ;

    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return 0;
    }
    
    public String toString(){
        return "Radius : " + this.radius + "Color : " + this.color ;
    }
}
