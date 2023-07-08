package zadania.iterator.exercises.ex3;

public class CzesneVisitor implements Visitor{
    @Override
    public void visit(Student student) {
        if(student.czyPrzyslugujeZwolnienie()) {
            student.setZwolnienieCzesne(true);
        }
    }
}
