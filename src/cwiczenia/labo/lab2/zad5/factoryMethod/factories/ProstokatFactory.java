package cwiczenia.labo.lab2.zad5.factoryMethod.factories;

import cwiczenia.labo.lab2.zad5.factoryMethod.products.Prostokat;
import cwiczenia.labo.lab2.zad5.factoryMethod.products.Shape;

public class ProstokatFactory extends ShapeFactory{

    Double a,b;

    public ProstokatFactory(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Shape createShape() {
        return new Prostokat(this.a, this.b);
    }
}
