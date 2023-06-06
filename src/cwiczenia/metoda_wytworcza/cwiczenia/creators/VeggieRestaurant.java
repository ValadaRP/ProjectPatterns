package cwiczenia.metoda_wytworcza.cwiczenia.creators;

import cwiczenia.metoda_wytworcza.cwiczenia.product.Burger;
import cwiczenia.metoda_wytworcza.cwiczenia.product.VeggieBurger;

public class VeggieRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
