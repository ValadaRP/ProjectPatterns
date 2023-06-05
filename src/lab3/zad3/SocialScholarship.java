package lab3.zad3;

public class SocialScholarship extends Student{
    public SocialScholarship(Student student) {
        super(student.getIndex());
        scholarships.addAll(student.getScholarships());
        addScholarship("Social Scholarship");
    }
}
