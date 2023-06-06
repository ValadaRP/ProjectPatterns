package cwiczenia.metoda_wytworcza.cwiczenia.creators;

import cwiczenia.metoda_wytworcza.cwiczenia.product.Burger;

public abstract class Restaurant {

    public void orderBurger(){
        Burger burger = createBurger();
        burger.prepareBurger();
    }

    public abstract Burger createBurger();
}
