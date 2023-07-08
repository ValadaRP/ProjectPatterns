package nowelabo.lab5.cwiczenie1;

import java.util.ArrayList;
import java.util.List;

public class GrupaZadan implements Zadanie{
    private String nazwa;
    private List<Zadanie> zadania;

    public GrupaZadan(String nazwa) {
        this.nazwa = nazwa;
        this.zadania = new ArrayList<>();
    }

    public void dodaj(Zadanie zadanie) {
        zadania.add(zadanie);
    }

    public void usun(Zadanie zadanie) {
        zadania.remove(zadanie);
    }

    public void wyswietl(int poziom) {
        System.out.println(" ".repeat(poziom) + "Grupa zadań: " + nazwa);

        for (Zadanie zadanie : zadania) {
            zadanie.wyswietl(poziom + 1);
        }
    }
}
