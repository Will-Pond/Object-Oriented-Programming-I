import java.util.Scanner;

class QuadraticOOP {

    // member fields
    private int a, b, c;

    // constructor
    QuadraticOOP(int a, int b, int c) {
    discriminant = (Math.pow(b,2) - 4 * a *c);
    r1 = (-b + Math.sqrt(discriminant)) / (2*a);
    r2 = (-b - Math.sqrt(discriminant)) / (2*a);


    }

    // implement methods
    // 1. public double getDiscriminant() {
    public double getDiscriminant(){return discriminant;}
    // 2. double getSolution1() {
    double discriminant = b * b- 4 * a * c;
    public double getSolution1(){return r1;}
    // 3. double getSolution2() {

        double r1 = (-b + Math.sqrt(discriminant)) / (2*a);
    public double getSolution2(){return r2;}
    double r2 = (-b - Math.sqrt(discriminant)) / (2*a);

}

public class QuadraticOOPTest {
    public static void main(String[] args) {
        QuadraticOOP q = new QuadraticOOP(1, 3, 1);
        System.out.println(q.getDiscriminant());
        System.out.println(q.getSolution1());
        System.out.println(q.getSolution2());
    }
}

/**
 5.0
 -0.3819660112501051
 -2.618033988749895
 */
