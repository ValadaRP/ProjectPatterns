package cwiczenia.kompozyt.cwiczenia.products;

import cwiczenia.kompozyt.cwiczenia.Box;
import lombok.Data;

@Data
public abstract class Product implements Box {
    public Product(String name, double prize) {
        this.name = name;
        this.prize = prize;
    }

    protected String name;
    protected double prize;
}
