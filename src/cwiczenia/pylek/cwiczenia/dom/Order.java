package cwiczenia.pylek.cwiczenia.dom;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private FloweFactory floweFactory;
    private Map<FlowerFlyweight, Integer> flowers;

    public Order(FloweFactory floweFactory, Map<FlowerFlyweight, Integer> flowers) {
        this.floweFactory = floweFactory;
        this.flowers = new HashMap<>();
    }

    public void addFloer(String species, String color, String name, Double price, Integer quantity) {
        FlowerFlyweight flowerFlyweight = floweFactory.getFlyweight(species, color, name, price);
        flowers.put(flowerFlyweight, quantity);
    }
}
