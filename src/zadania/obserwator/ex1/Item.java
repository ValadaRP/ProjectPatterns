package zadania.obserwator.ex1;

public class Item {
    private String name;
    private double minPrice;
    private String description;

    public Item(String name, double minPrice, String description) {
        this.name = name;
        this.minPrice = minPrice;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + minPrice +
                ", description='" + description + '\'' +
                '}';
    }
}
