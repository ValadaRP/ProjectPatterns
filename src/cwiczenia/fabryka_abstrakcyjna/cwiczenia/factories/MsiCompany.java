package cwiczenia.fabryka_abstrakcyjna.cwiczenia.factories;

import cwiczenia.fabryka_abstrakcyjna.cwiczenia.products.Gpu.Gpu;
import cwiczenia.fabryka_abstrakcyjna.cwiczenia.products.Gpu.MsiGpu;
import cwiczenia.fabryka_abstrakcyjna.cwiczenia.products.Monitor.Monitor;
import cwiczenia.fabryka_abstrakcyjna.cwiczenia.products.Monitor.MsiMonitor;

public class MsiCompany extends Company{
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
