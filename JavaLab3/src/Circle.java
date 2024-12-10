public class Circle extends GeometricObject {
    private double radius;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }


public double getRadius(){
    return radius;
}
public void setRadius(double radius){
    this.radius = radius;
}
public double getArea(){
    return radius * getDiameter() * getDiameter();
}
public double getPerimeter(){
    return 2 * getDiameter() * radius;
}
public double getDiameter(){
    return 5.0;
}
}