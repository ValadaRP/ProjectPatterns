package cwiczenia.pylek.cwiczenia.labo.konkretneprzedmioty;

import cwiczenia.pylek.cwiczenia.labo.Przedmiot;

public class Mapa implements Przedmiot {

    private String tytul;
    private String cena;

    public Mapa(String tytul, String cena) {
        this.tytul = tytul;
        this.cena = cena;
    }


    @Override
    public void wyswietl() {
        System.out.println("Mapa - Tytuł: " + tytul  + ", Cena: " + cena);
    }
}
