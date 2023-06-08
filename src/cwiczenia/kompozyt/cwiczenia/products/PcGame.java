package cwiczenia.kompozyt.cwiczenia.products;

public class PcGame extends Product{

    public PcGame(String name, double prize) {
        super(name, prize);
    }

    @Override
    public double calculatePrize() {
        return getPrize();
    }
}
