package cwiczenia.fabryka_abstrakcyjna.cwiczenia.factories;

import cwiczenia.fabryka_abstrakcyjna.cwiczenia.products.Gpu.Gpu;
import cwiczenia.fabryka_abstrakcyjna.cwiczenia.products.Monitor.Monitor;

public abstract class Company {

    public abstract Gpu createGpu();
    public abstract Monitor createMonitor();
}
