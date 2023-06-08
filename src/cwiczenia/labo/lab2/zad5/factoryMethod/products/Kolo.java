package cwiczenia.labo.lab2.zad5.factoryMethod.products;

public class Kolo implements Shape{

    private Double r;

    public Kolo(Double r) {
        this.r = r;
    }

    @Override
    public Double obliczPole() {
        return Math.PI * Math.pow(r,2);
    }

    @Override
    public Double obliczObwod() {
        return 2 * Math.PI * r;
    }
}
