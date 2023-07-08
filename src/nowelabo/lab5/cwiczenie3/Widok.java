package nowelabo.lab5.cwiczenie3;

public class Widok {
    private TablicaJednowymiarowa tablica;

    public Widok() {
        tablica = new TablicaJednowymiarowa();
    }

    public void utworzTablice(int rozmiar) {
        tablica.inicjalizuj(rozmiar);
    }

    public void wyswietl(String separator) {
        for (int i = 0; i < tablica.getRozmiar(); i++) {
            System.out.print(tablica.pobierzElement(i));

            if (i != tablica.getRozmiar() - 1) {
                System.out.print(separator);
            }
        }
        System.out.println();
    }
}
