package lab3.zad6;


public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle rectangle = new Rectangle("10", "20");
        System.out.println(rectangle);

        Rectangle rectangle1 = (Rectangle) rectangle.clone();
        System.out.println(rectangle1);
    }
}
