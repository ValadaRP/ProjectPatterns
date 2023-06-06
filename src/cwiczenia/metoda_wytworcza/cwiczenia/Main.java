package cwiczenia.metoda_wytworcza.cwiczenia;

import cwiczenia.metoda_wytworcza.cwiczenia.creators.BeefRestaurant;
import cwiczenia.metoda_wytworcza.cwiczenia.creators.Restaurant;
import cwiczenia.metoda_wytworcza.cwiczenia.creators.VeggieRestaurant;

public class Main {
    public static void main(String[] args){
        Restaurant beefRes = new BeefRestaurant();
        beefRes.orderBurger();

        System.out.println("------------------------");

        Restaurant veggieRes = new VeggieRestaurant();
        veggieRes.orderBurger();
    }
}
