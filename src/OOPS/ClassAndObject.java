package OOPS;

class circle {
    static double pi = 3.14;
    private final double radius;
    circle(double radius)
    {
        this.radius = radius;
    }
    void diameter()
    {
        System.out.println("Diameter of circle : "+(radius*2));
    }
    void area()
    {
        System.out.println("Area of circle : "+(pi*(radius*radius)));
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        circle c = new circle(5);
        c.area();
        c.diameter();
    }
}
