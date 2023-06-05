package zad5;

public class Cube implements Shape{

    private double a;


    @Override
    public void calculateArea() {
        double area = 6 * Math.pow(a, 2);
        System.out.println("Pole to: " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 12 * a;
        System.out.println("Obwód to: " + perimeter);
    }
}
