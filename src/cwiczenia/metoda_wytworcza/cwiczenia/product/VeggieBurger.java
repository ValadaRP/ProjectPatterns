package cwiczenia.metoda_wytworcza.cwiczenia.product;

import cwiczenia.metoda_wytworcza.cwiczenia.product.Burger;

public class VeggieBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("Preparing Veggie Burger");
    }
}
