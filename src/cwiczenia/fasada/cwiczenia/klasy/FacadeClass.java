package cwiczenia.fasada.cwiczenia.klasy;

public class FacadeClass {

    private Osoba osoba;

    public FacadeClass(String imie, String naziwsko, String wiek, String stanowisko) {
        this.osoba = new Osoba(imie,naziwsko,wiek,stanowisko);
    }

    public void getName(){
        System.out.println("Imie: " + this.osoba.imie);
    }
}
