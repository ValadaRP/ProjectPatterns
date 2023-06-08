package cwiczenia.labo.lab2.zad5.factories;

import cwiczenia.labo.lab2.zad5.products.obwod.Obwod;
import cwiczenia.labo.lab2.zad5.products.obwod.ObwodProstokat;
import cwiczenia.labo.lab2.zad5.products.pole.Pole;
import cwiczenia.labo.lab2.zad5.products.pole.PoleProstokat;

public class Prostokat extends Shape{
    @Override
    public Obwod policzObwod() {
        return new ObwodProstokat();
    }

    @Override
    public Pole policzPole() {
        return new PoleProstokat();
    }
}
