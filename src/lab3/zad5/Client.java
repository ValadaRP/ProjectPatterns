package lab3.zad5;

public class Client {
    public static void main(String[] args) {
        PracticeDirector director = new PracticeDirector();
        PilotPractice builder = new PilotPractice();
        director.constructPilotPractice(builder,"2");
        Practice practice = builder.getPractice();
        System.out.println(practice);

    }
}
