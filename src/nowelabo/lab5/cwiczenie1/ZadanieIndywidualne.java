package nowelabo.lab5.cwiczenie1;

public class ZadanieIndywidualne implements Zadanie{
    private String nazwa;

    public ZadanieIndywidualne(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodaj(Zadanie zadanie) {
        // Nie jest możliwe dodanie zadania do pojedynczego zadania
        System.out.println("Nie można dodać zadania do pojedynczego zadania.");
    }

    public void usun(Zadanie zadanie) {
        // Nie jest możliwe usunięcie zadania z pojedynczego zadania
        System.out.println("Nie można usunąć zadania z pojedynczego zadania.");
    }

    public void wyswietl(int poziom) {
        System.out.println(" ".repeat(poziom) + "Zadanie: " + nazwa);
    }
}
