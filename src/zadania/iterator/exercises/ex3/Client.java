package zadania.iterator.exercises.ex3;

public class Client {
    public static void main(String[] args) {
        Studenci students = new Studenci();
        students.dodaj(new Student(4.3, false,true));
        students.dodaj(new Student(3.3, true,false));
        students.display();
//        students.wizytuj(new GymVisitor());
//        students.wizytuj(new CzesneVisitor());
//        students.wizytuj(new LibraryVisitor());
        students.wizytuj(new ShootingVisitor());
        students.display();
    }
}
