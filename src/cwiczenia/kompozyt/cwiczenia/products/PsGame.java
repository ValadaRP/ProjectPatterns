package cwiczenia.kompozyt.cwiczenia.products;

public class PsGame extends Product{
    public PsGame(String name, double prize) {
        super(name,prize);
    }

    @Override
    public double calculatePrize() {
        return getPrize();
    }
}
