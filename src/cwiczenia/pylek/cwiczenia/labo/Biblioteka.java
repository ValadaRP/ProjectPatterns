package cwiczenia.pylek.cwiczenia.labo;

import cwiczenia.pylek.cwiczenia.labo.konkretneprzedmioty.ItemType;
import cwiczenia.pylek.cwiczenia.labo.konkretneprzedmioty.Ksiazka;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    private final List<Przedmiot> przedmioty = new ArrayList<>();

    public void dodajPrzedmiot(String tytul, String cena, String typ, String dystrybutor, String inneDane){
        ItemType itemType = FabrykaPrzedmiotow.getItem(typ, dystrybutor);
        przedmioty.add(new Ksiazka(tytul, cena, itemType));
    }
}
