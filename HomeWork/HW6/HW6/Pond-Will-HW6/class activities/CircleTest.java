class Circle {
double radius = 1;

Circle(){}
    Circle(double newRadius) { radius = newRadius;}
    public double getArea(){
    return radius * radius * Math.PI;
    }
    public double getCircumference(){
    return 2 * Math.PI * radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 2;
        System.out.println("1.1: " + (circle.getArea() == (4 * Math.PI)));
        System.out.println("1.2: " + (circle.getCircumference() == (4 * Math.PI)));
    }
}

/**
 * output
 1.1: true
 1.2: true
 */