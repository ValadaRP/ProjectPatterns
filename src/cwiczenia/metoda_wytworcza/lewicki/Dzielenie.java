package cwiczenia.metoda_wytworcza.lewicki;

public class Dzielenie extends Wynik {
    
    public Dzielenie(String liczba1, String liczba2) {
        String zero = "0";

        if (liczba1.matches("[0-9+-.]+") || liczba2.matches("[0-9+-.]+")) {
            if (!liczba2.equals(zero)) {
                wynik = Float.parseFloat(liczba1) / Float.parseFloat(liczba2);

            } else {
                throw new IllegalArgumentException("Nie wolno dzieli� przez zero");
            }
        } else {
            throw new IllegalArgumentException("Z�y format danych");
        }


    }
}
