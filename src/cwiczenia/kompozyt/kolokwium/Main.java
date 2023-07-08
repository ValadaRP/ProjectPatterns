package cwiczenia.kompozyt.kolokwium;


import cwiczenia.kompozyt.kolokwium.products.Programmer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Project project = new Manager("Manager",new ArrayList<>(
                List.of(
                new Programmer("Programmer1"),
                new Programmer("Programmer2"),
                new Programmer("Programmer3"),
                new Manager("Manager2", List.of(
                        new Programmer("Programmer4"),
                        new Programmer("Programmer5"),
                        new Programmer("Programmer6")
                )))));
        project.print();
    }
}
