package zadania.wizytor.ex1;

public class Client {
    public static void main(String[] args) {
        Paczki paczki = new Paczki();
        paczki.dodaj(new LekkaPaczka("Gliwice"));
        paczki.dodaj(new InnaPaczka("Rzeszow"));
        paczki.dodaj(new CiezkaPaczka("Warszawa"));
        paczki.wizytuj(new CostVisitor());

        paczki.displayDetails();
    }
}
