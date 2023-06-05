package cwiczenia.fabryka_abstrakcyjna.cwiczenia.factories;

import cwiczenia.fabryka_abstrakcyjna.cwiczenia.products.Gpu.AsusGPU;
import cwiczenia.fabryka_abstrakcyjna.cwiczenia.products.Gpu.Gpu;
import cwiczenia.fabryka_abstrakcyjna.cwiczenia.products.Monitor.Monitor;
import cwiczenia.fabryka_abstrakcyjna.cwiczenia.products.Monitor.MsiMonitor;

public class AsusCompany extends Company{
    @Override
    public Gpu createGpu() {
        return new AsusGPU();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
