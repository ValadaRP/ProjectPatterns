package cwiczenia.labo.lab2.zad5.factoryMethod.factories;

import cwiczenia.labo.lab2.zad5.factoryMethod.products.Kolo;
import cwiczenia.labo.lab2.zad5.factoryMethod.products.Shape;

public class KoloFactory extends ShapeFactory{
    private Double r;

    public KoloFactory(Double r) {
        this.r = r;
    }

    @Override
    public Shape createShape() {
        return new Kolo(r);
    }
}
