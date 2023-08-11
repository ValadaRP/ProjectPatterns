package zadania.wizytor.ex3;

public class LibraryVisitor implements Visitor{
    @Override
    public void visit(Student student) {
        if(student.czyPrzyslugujeZwolnienie()){
            student.setLimitBiblioteka(20);
        }
    }
}
