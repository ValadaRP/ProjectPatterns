package lab3.zad3;

public class ReasearchScholarship extends Student{
    public ReasearchScholarship(Student student) {
        super(student.getIndex());
        scholarships.addAll(student.getScholarships());
        addScholarship("Reasearch Scholarship");
    }
}
