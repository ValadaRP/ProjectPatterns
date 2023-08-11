package zadania.obserwator.ex1;

import java.util.ArrayList;
import java.util.HashMap;

public class Auction extends Publisher {
    private ArrayList<Observer> observers;
    private HashMap<Item, Double> auctionItems;

    public Auction() {
        this.observers = new ArrayList<>();
        this.auctionItems = new HashMap<>();
    }

    @Override
    public void add(Observer o) {
        if (!this.observers.contains(o))
            this.observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObserver(Item item) {
        for (Observer o : this.observers)
            o.update(item, this.auctionItems.get(item));
    }

    public void bidItem(Item item, double price) {
        if (this.auctionItems.containsKey(item)) {
            if (this.auctionItems.get(item) < price) {
                this.auctionItems.replace(item, price);
                this.notifyObserver(item);
            }
        } else {
            if (item.getMinPrice() > price) {
                System.out.println("Price is too low!");
                return;
            }
            this.auctionItems.put(item, price);
            this.notifyObserver(item);
        }
    }
}
