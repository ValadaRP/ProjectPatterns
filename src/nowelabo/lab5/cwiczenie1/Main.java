package nowelabo.lab5.cwiczenie1;

public class Main {
    public static void main(String[] args) {
        ZadanieIndywidualne zadanie1 = new ZadanieIndywidualne("Zadanie 1");
        ZadanieIndywidualne zadanie2 = new ZadanieIndywidualne("Zadanie 2");
        ZadanieIndywidualne zadanie3 = new ZadanieIndywidualne("Zadanie 3");

        GrupaZadan grupaZadan1 = new GrupaZadan("Grupa zadań 1");
        grupaZadan1.dodaj(zadanie1);
        grupaZadan1.dodaj(zadanie2);

        GrupaZadan grupaZadan2 = new GrupaZadan("Grupa zadań 2");
        grupaZadan2.dodaj(zadanie3);

        GrupaZadan projekt = new GrupaZadan("Projekt");
        projekt.dodaj(grupaZadan1);
        projekt.dodaj(grupaZadan2);

        projekt.wyswietl(0);
    }
}
