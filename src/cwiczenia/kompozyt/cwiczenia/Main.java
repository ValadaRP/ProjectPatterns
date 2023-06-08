package cwiczenia.kompozyt.cwiczenia;

import cwiczenia.kompozyt.cwiczenia.products.PcGame;
import cwiczenia.kompozyt.cwiczenia.products.PsGame;
import cwiczenia.kompozyt.gikific.products.Book;


public class Main {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(
                new CompositeBox(
                        new PcGame("1", 100.0)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new PsGame("Fajna", 400.0),
                                new PsGame("Fajna", 400.0)
                        ),
                        new PcGame("4", 400),
                        new PcGame("5", 500)
                )
        );
        System.out.println(deliveryService.calculateOrderPrize());
    }
}
