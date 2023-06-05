package cwiczenia.metoda_wytworcza.geekific;

public abstract class Restaurant {

    public void orderBurger(){
        Burger burger = createBurger();
        burger.prepareBurger();
    }

    public abstract Burger createBurger();
}
