package lab3.zad3;

public class RectorScholarship extends Student{
    public RectorScholarship(Student student) {
        super(student.getIndex());
        scholarships.addAll(student.getScholarships());
        addScholarship("Rectors Scholarship");
    }
}
