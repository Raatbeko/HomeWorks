package circle;

public class Circle {
    private static final double PI = 3.14;
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void square() {
        System.out.println(2 * PI * radius);
    }

    public static void square(double radius2) {
        System.out.println(2 * PI * radius2);

    }

    public static double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
