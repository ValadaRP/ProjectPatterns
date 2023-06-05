package lab3.zad3;

public class Client {
    public static void main(String[] args) {
        Student student=new Student("37214");
        student.wyswietlStypednia();
        System.out.println();

        student = new SocialScholarship(student);
        student.wyswietlStypednia();
        System.out.println();

        student = new ReasearchScholarship(student);
        student.wyswietlStypednia();
        System.out.println();

        student = new RectorScholarship(student);
        student.wyswietlStypednia();
        System.out.println();

        student.removeScholarship("Rectors Scholarship");
        student.wyswietlStypednia();
    }

}
