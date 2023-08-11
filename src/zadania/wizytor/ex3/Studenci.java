package zadania.wizytor.ex3;

import java.util.ArrayList;
import java.util.List;

public class Studenci {
    private List<Student> studenci = new ArrayList<Student>();

    public void dodaj(Student student) {
        studenci.add(student);
    }

    public void usun(Student student) {
        studenci.remove(student);
    }

    public void wizytuj(Visitor visitor) {
        for (Student e : this.studenci) {
            e.wizytuj(visitor);
        }
        System.out.println();
    }
    public void display() {
        for (Student e : this.studenci) {
            System.out.println();
            System.out.println(e);
        }
        System.out.println();
    }
}
