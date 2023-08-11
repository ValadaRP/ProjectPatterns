package zadania.obserwator.ex1;

public class Client {
    public static void main(String[] args) {
        Item item1 = new Item("Laptop", 2000, "Dell laptop");
        Item item2 = new Item("Smartphone", 1500, "Samsung smartphone");

        Auction auction = new Auction();
        AuctionObserver observer1 = new AuctionObserver();
        AuctionObserver observer2 = new AuctionObserver();

        // Dodawanie obserwatorów
        auction.add(observer1);
        auction.add(observer2);

        // Dodawanie interesujących przedmiotów przez obserwatorów
        observer1.addInterestedItem(item1, null);
        observer2.addInterestedItem(item2, null);

        // Licytacja przedmiotów
        auction.bidItem(item1, 2200);
        auction.bidItem(item2, 1600);
        auction.bidItem(item1, 2100);
    }
}
