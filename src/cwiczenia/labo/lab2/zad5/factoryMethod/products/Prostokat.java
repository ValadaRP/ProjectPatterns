package cwiczenia.labo.lab2.zad5.factoryMethod.products;

public class Prostokat implements Shape{

    private Double a, b;

    public Prostokat(Double a, Double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public Double obliczPole() {
        return a*b;
    }

    @Override
    public Double obliczObwod() {
        return (2 * a + 2 * b );
    }
}
