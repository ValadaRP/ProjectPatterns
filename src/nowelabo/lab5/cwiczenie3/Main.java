package nowelabo.lab5.cwiczenie3;

public class Main {
    public static void main(String[] args) {
        Fasada fasada = new Fasada();

        // Tworzenie tablicy
        fasada.stworzTablice(5);

        // Zmiana zawartości tablicy
        fasada.zmienZawartoscTablicy(0, "Jabłka");
        fasada.zmienZawartoscTablicy(1, "Banan");
        fasada.zmienZawartoscTablicy(2, "Pomarańcza");
        fasada.zmienZawartoscTablicy(3, "Winogrona");
        fasada.zmienZawartoscTablicy(4, "Kiwi");

        // Wyświetlanie tablicy z zastosowaniem separatora
        fasada.wyswietlTablice(";");

        // Zapisywanie tablicy do pliku
        fasada.zapiszTabliceDoPliku("ścieżka/do/pliku.txt");
    }
}
