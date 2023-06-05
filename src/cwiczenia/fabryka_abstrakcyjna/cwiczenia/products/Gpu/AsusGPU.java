package cwiczenia.fabryka_abstrakcyjna.cwiczenia.products.Gpu;

public class AsusGPU implements Gpu{
    @Override
    public void assemble() {
        System.out.println("Skladanie produktu z AsusGpu");
    }
}
