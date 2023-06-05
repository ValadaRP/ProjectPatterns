package zad5;

public class Triangle implements Shape{

    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public void calculateArea() {
        double area = (a * h) / 2;
        System.out.println("Pole to: " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = a + b + c;
        System.out.println("Obwód to: " + perimeter);
    }
}
