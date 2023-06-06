package cwiczenia.metoda_wytworcza.cwiczenia.creators;

import cwiczenia.metoda_wytworcza.cwiczenia.product.BeefBurger;
import cwiczenia.metoda_wytworcza.cwiczenia.product.Burger;

public class BeefRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
