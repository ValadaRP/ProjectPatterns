package cwiczenia.pylek.cwiczenia.dom;

public class FlowerFlyweight {

    private String species;
    private String color;
    private String name;
    private Double price;

    public FlowerFlyweight(String species, String color, String name, Double price) {
        this.species = species;
        this.color = color;
        this.name = name;
        this.price = price;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
