package lab3.zad3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    protected String index;
    protected List<String> scholarships;

    public Student(String index) {
        this.index = index;
        this.scholarships = new ArrayList<>();
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public List<String> getScholarships() {
        return scholarships;
    }

    public void setScholarships(List<String> scholarships) {
        this.scholarships = scholarships;
    }

    public void addScholarship(String scholarship) {
        this.scholarships.add(scholarship);
    }

    public void removeScholarship(String scholarship) {
        this.scholarships.remove(scholarship);
    }

    public void wyswietlStypednia() {
        System.out.println("Studentowi " + this.index + " przysgługują stypendia:");
        for (String scholarship : this.scholarships) {
            System.out.println(scholarship);
        }
    }
}
