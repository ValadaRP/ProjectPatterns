package cwiczenia.labo.lab2.zad5.factoryMethod;

import cwiczenia.labo.lab2.zad5.factoryMethod.factories.ProstokatFactory;
import cwiczenia.labo.lab2.zad5.factoryMethod.factories.ShapeFactory;
import cwiczenia.labo.lab2.zad5.factoryMethod.products.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory prostokat = new ProstokatFactory(4.0, 5.0);
        Shape shape = prostokat.createShape();
        System.out.println(shape.obliczPole());



    }
}
