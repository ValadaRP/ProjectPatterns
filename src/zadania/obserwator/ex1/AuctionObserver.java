package zadania.obserwator.ex1;

import java.util.HashMap;

public class AuctionObserver implements Observer {
    private HashMap<Item, Double> interestedItems;

    public AuctionObserver() {
        this.interestedItems = new HashMap<>();
    }

    public void addInterestedItem(Item item, Double actualPrice) {
        if (!interestedItems.containsKey(item)) {
            if (actualPrice == null)
                actualPrice = item.getMinPrice();
            interestedItems.put(item, actualPrice);
        }
    }

    public void removeInterestedItem(Item item) {
        interestedItems.remove(item);
    }

    @Override
    public void update(Object o, Double price) {
        if (interestedItems.containsKey(o)) {
            interestedItems.replace((Item) o, price);
            System.out.println("Aktualizacja ceny");
        }
    }
}
