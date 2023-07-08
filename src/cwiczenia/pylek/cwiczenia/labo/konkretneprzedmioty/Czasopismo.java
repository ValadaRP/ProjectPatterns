package cwiczenia.pylek.cwiczenia.labo.konkretneprzedmioty;

import cwiczenia.pylek.cwiczenia.labo.Przedmiot;

public class Czasopismo implements Przedmiot {
    private String tytul;
    private String cena;

    private ItemType itemType;

    public Czasopismo(String tytul, String cena, ItemType itemType) {
        this.tytul = tytul;
        this.cena = cena;
        this.itemType = itemType;
    }

    @Override
    public void wyswietl() {
        System.out.println("Czasopismo - Tytuł: " + tytul  + ", Cena: " + cena);
    }
}
