package cwiczenia.pylek.cwiczenia.labo.konkretneprzedmioty;

import cwiczenia.pylek.cwiczenia.labo.Przedmiot;

public class Ksiazka implements Przedmiot {
    private String tytul;
    private String cena;

    private ItemType itemType;

    public Ksiazka(String tytul, String cena, ItemType itemType) {
        this.tytul = tytul;
        this.cena = cena;
        this.itemType = itemType;
    }



    @Override
    public void wyswietl() {
        System.out.println("Książka - Tytuł: " + tytul  + ", Cena: " + cena);
    }
}
