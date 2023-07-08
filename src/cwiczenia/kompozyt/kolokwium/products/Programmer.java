package cwiczenia.kompozyt.kolokwium.products;

import cwiczenia.kompozyt.kolokwium.Project;

public class Programmer implements Project {
    String name;

    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public void add(Project project) {

    }

    @Override
    public void remove(Project project) {

    }

    @Override
    public void print() {
        System.out.println("Programmer{" +
                "name='" + name + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                '}';
    }
}
