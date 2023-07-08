package zadania.iterator.exercises.ex3;

public class GymVisitor implements Visitor{
    @Override
    public void visit(Student student) {
        if(student.czyPrzyslugujeZwolnienie()){
            student.setKarnetSilownia(true);
        }
    }
}
