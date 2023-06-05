package cwiczenia.fabryka_abstrakcyjna.cwiczenia.products.Monitor;

public class MsiMonitor implements Monitor{
    @Override
    public void assemble() {
        System.out.println("Skladanie monitora MSI");
    }
}
