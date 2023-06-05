package zad5;

public class Circle implements Shape{

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * Math.pow(r, 2);
        System.out.println("Pole koła to: " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * r;
        System.out.println("Obwód to: " + perimeter);
    }
}
