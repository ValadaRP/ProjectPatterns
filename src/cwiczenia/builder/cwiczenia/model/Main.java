package cwiczenia.builder.cwiczenia.model;

public class Main {
    public static void main(String[] args){
        Driector driector = new Driector();
        CharacterBuilder characterBuilder = new CharacterBuilder();

        driector.buildWarrior(characterBuilder);
        System.out.println(characterBuilder.build());
    }
}
