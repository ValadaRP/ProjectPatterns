package nowelabo.lab5.cwiczenie3;

public class Fasada {
    private TablicaJednowymiarowa tablica;
    private PlikTekstowy plik;

    public Fasada() {
        tablica = new TablicaJednowymiarowa();
        plik = new PlikTekstowy();
    }

    public void stworzTablice(int rozmiar) {
        tablica.inicjalizuj(rozmiar);
    }

    public void zmienZawartoscTablicy(int indeks, String nowaWartosc) {
        tablica.zmienZawartosc(indeks, nowaWartosc);
    }

    public void wyswietlTablice(String separator) {
        Widok widok = new Widok();
        widok.utworzTablice(tablica.getRozmiar());
        widok.wyswietl(separator);
    }

    public void zapiszTabliceDoPliku(String zawartosc) {
        plik.zapisz(zawartosc);
    }
}
