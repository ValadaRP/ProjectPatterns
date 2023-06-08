package cwiczenia.labo.lab2.zad5.products.pole;

public class PoleProstokat implements Pole{
    int a,b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public Integer oblicz() {
        return a+b;
    }
}
