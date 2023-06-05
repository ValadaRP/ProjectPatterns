package cwiczenia.metoda_wytworcza.cwiczenia;

public class BeefRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
