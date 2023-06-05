package cwiczenia.fabryka_abstrakcyjna.cwiczenia.products.Monitor;

public class AsusMonitor implements Monitor{
    @Override
    public void assemble() {
        System.out.println("Skladanie monitora Asus");
    }
}
