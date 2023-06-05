package cwiczenia.builder.cwiczenia.model;

public class Character {
    private int sila,zrecznosc,inteligencja, szczescie;

    public Character(int sila, int zrecznosc, int inteligencja, int szczescie) {
        this.sila = sila;
        this.zrecznosc = zrecznosc;
        this.inteligencja = inteligencja;
        this.szczescie = szczescie;
    }

    @Override
    public String toString() {
        return "Character{" +
                "sila=" + sila +
                ", zrecznosc=" + zrecznosc +
                ", inteligencja=" + inteligencja +
                ", szczescie=" + szczescie +
                '}';
    }
}
