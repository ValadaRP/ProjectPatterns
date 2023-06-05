package cwiczenia.fabryka_abstrakcyjna.cwiczenia;

import cwiczenia.fabryka_abstrakcyjna.cwiczenia.factories.AsusCompany;
import cwiczenia.fabryka_abstrakcyjna.cwiczenia.factories.Company;
import cwiczenia.fabryka_abstrakcyjna.cwiczenia.factories.MsiCompany;
import cwiczenia.fabryka_abstrakcyjna.cwiczenia.products.Gpu.Gpu;

public class Main {
    public static void main(String[] args){
        Company asusCompany = new AsusCompany();
        Gpu gpu = asusCompany.createGpu();
        gpu.assemble();
        Company msiCompany = new MsiCompany();
        Gpu msiGpu =  msiCompany.createGpu();
        msiGpu.assemble();
    }
}
