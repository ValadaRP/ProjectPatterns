package nowelabo.lab5.cwiczenie3;

public class TablicaJednowymiarowa {
    private String[] tablica;

    public void inicjalizuj(int rozmiar) {
        tablica = new String[rozmiar];
    }

    public String pobierzElement(int indeks) {
        if (indeks >= 0 && indeks < tablica.length) {
            return tablica[indeks];
        } else {
            return null;
        }
    }

    public void zmienZawartosc(int indeks, String nowaWartosc) {
        if (indeks >= 0 && indeks < tablica.length) {
            tablica[indeks] = nowaWartosc;
        }
    }

    public int getRozmiar() {
        return tablica.length;
    }
}
