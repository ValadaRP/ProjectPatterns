package cwiczenia.pylek.cwiczenia.labo.konkretneprzedmioty;

public class ItemType {
    private final String typ;
    private final String dystrybutor;

    public ItemType(String typ, String dystrybutor) {
        this.typ = typ;
        this.dystrybutor = dystrybutor;
    }

    public String getTyp() {
        return typ;
    }

    public String getDystrybutor() {
        return dystrybutor;
    }

    @Override
    public String toString() {
        return "ItemType{" +
                "typ='" + typ + '\'' +
                ", dystrybutor='" + dystrybutor + '\'' +
                '}';
    }
}
