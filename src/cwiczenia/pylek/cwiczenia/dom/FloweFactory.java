package cwiczenia.pylek.cwiczenia.dom;

import java.util.Map;

public class FloweFactory {
    private Map<String, FlowerFlyweight> flyweights;

    public FloweFactory(Map<String, FlowerFlyweight> flyweights) {
        this.flyweights = flyweights;
    }

    public FlowerFlyweight getFlyweight(String species, String color, String name, Double price) {
        String key = species + "-" + name + "-" + color;
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        } else {
            FlowerFlyweight flowerFlyweight = new FlowerFlyweight(species, color, name, price);
            flyweights.put(key, flowerFlyweight);
            return flowerFlyweight;
        }
    }
}
