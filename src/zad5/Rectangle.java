package zad5;

public class Rectangle implements Shape{

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void calculateArea() {
        double area = a * b;
        System.out.println("Pole to: " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * a + 2 * b;
        System.out.println("Obwód to: " + perimeter);
    }
}
