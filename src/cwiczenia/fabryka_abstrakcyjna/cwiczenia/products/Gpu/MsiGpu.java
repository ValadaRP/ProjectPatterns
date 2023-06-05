package cwiczenia.fabryka_abstrakcyjna.cwiczenia.products.Gpu;

public class MsiGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("Skladania produktu z MSI GPU");
    }
}
