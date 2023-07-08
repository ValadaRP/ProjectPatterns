package cwiczenia.pylek.cwiczenia.labo.konkretneprzedmioty;

import cwiczenia.pylek.cwiczenia.labo.Przedmiot;

public class Przewodnik implements Przedmiot {
    private String tytul;
    private String autor;
    private String cena;

    private ItemType itemType;

    public Przewodnik(String tytul, String autor, String cena, ItemType itemType) {
        this.tytul = tytul;
        this.autor = autor;
        this.cena = cena;
        this.itemType = itemType;
    }


    @Override
    public void wyswietl() {
        System.out.println("Przewodnik - Tytuł: " + tytul  + ", Autor: " + autor + ", Cena: " + cena);
    }
}
