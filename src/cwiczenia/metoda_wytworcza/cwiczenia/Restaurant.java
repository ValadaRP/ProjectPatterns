package cwiczenia.metoda_wytworcza.cwiczenia;

public abstract class Restaurant {

    public void orderBurger(){
        Burger burger = createBurger();
        burger.prepareBurger();
    }

    public abstract Burger createBurger();
}
