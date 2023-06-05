package cwiczenia.builder.cwiczenia.model;

public class CharacterBuilder implements Builder{
    private int sila,zrecznosc,inteligencja, szczescie;

    @Override
    public Builder sila(int sila) {
        this.sila = sila;
        return this;
    }

    @Override
    public Builder zrecznosc(int zrecznosc) {
        this.zrecznosc = zrecznosc;
        return this;
    }

    @Override
    public Builder inteligencja(int inteligencja) {
        this.inteligencja = inteligencja;
        return this;
    }

    @Override
    public Builder szczescie(int szczescie) {
        this.szczescie = szczescie;
        return this;
    }

    public Character build() {
        return new Character(sila, zrecznosc, inteligencja, szczescie);
    }
}
