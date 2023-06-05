package zad5;

public class Rhombus implements Shape{

    private double a;
    private double h;

    public Rhombus(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public void calculateArea() {
        double area = a * h;
        System.out.println("Pole to: " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 4 * a;
        System.out.println("Obwód to: " + perimeter);
    }
}
