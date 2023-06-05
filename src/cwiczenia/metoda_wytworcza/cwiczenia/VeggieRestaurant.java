package cwiczenia.metoda_wytworcza.cwiczenia;

public class VeggieRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
