package zadania.iterator.exercises.ex3;

public class ShootingVisitor implements Visitor {
    @Override
    public void visit(Student student) {
        if (student.czyPrzyslugujeZwolnienie()) {
            student.setKarnetStrzelnica(true);
        }
    }
}
