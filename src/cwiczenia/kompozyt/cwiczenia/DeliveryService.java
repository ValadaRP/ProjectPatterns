package cwiczenia.kompozyt.cwiczenia;

public class DeliveryService {
    private Box box;

    public DeliveryService() {}

    public void setupOrder(Box... boxes){
        this.box = new CompositeBox(boxes);
    }

    public double calculateOrderPrize(){
        return box.calculatePrize();
    }
}
