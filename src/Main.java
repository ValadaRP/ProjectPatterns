import zad1.DoubleConverter;
import zad1.IntegerConverter;
import zad1.NumberConverterContext;
import zad5.*;
import zad6.CommandLineStorage;
import zad6.ConsoleTextStorage;
import zad6.TextSorter;
import zad6.TextStorage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ---------------------------
        // zad1
//        NumberConverterContext context = new NumberConverterContext(new IntegerConverter());
//        System.out.println(context.convert("123"));
//        context = new NumberConverterContext(new DoubleConverter());
//        System.out.println(context.convert("123.456"));
        // ---------------------------
        // ---------------------------
        //zad5
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the shape (rectangle, rhombus, triangle, circle, cuboid, pyramid, cylinder):");
//        String shapeType = scanner.nextLine();
//
//        Shape shape = null;
//        switch (shapeType) {
//            case "rectangle":
//                System.out.println("Enter the length:");
//                double length = scanner.nextDouble();
//                System.out.println("Enter the width:");
//                double width = scanner.nextDouble();
//                shape = new Rectangle(length, width);
//                shape.calculateArea();
//                shape.calculatePerimeter();
//                break;
//            case "rhombus":
//                System.out.println("Enter the side length:");
//                double side = scanner.nextDouble();
//                System.out.println("Enter the height:");
//                double rhombusHeight = scanner.nextDouble();
//                shape = new Rhombus(side, rhombusHeight);
//                shape.calculateArea();
//                shape.calculatePerimeter();
//                break;
//            case "triangle":
//                System.out.println("Enter the lengths of the three sides (a,b,c):");
//                double sideA = scanner.nextDouble();
//                double sideB = scanner.nextDouble();
//                double sideC = scanner.nextDouble();
//                System.out.println("Enter the h:");
//                double triangleHeight = scanner.nextDouble();
//                shape = new Triangle(sideA, sideB, sideC, triangleHeight);
//                shape.calculateArea();
//                shape.calculatePerimeter();
//                break;
//            case "circle":
//                System.out.println("Enter the radius:");
//                double radius = scanner.nextDouble();
//                shape = new Circle(radius);
//                shape.calculateArea();
//                shape.calculatePerimeter();
//                break;
//            default:
//                System.out.println("You made a mistake. Try again.");
//                break;
//        }
        //---------------------------
        //zad6
        TextStorage storageStrategy;

        if (args.length > 0) {
            storageStrategy = new CommandLineStorage(args);
        } else {
            storageStrategy = new ConsoleTextStorage();
        }

        TextSorter sorter = new TextSorter(storageStrategy);
        sorter.sort();
    }
}