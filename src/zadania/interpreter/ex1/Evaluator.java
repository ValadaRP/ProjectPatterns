package zadania.interpreter.ex1;


public class Evaluator {

    String[] symbols;
    String studySpec;

    public Evaluator(String expression) {

        symbols = expression.split("-")[0].split("");
        studySpec = expression.split("-")[1];
    }


    public String interpret() {
        Expression semester = new SemesterExpression();
        Expression studyType = new StudyType();
        Expression studyField = new StudyField();
        Expression studyForm = new StudyForm();
        Expression studySpec = new StudySpec();
        return semester.interpret(symbols[0]) + " " + studyType.interpret(symbols[1]) + " " + studyField.interpret(symbols[2]) + " " + studySpec.interpret(this.studySpec) + " " + studyForm.interpret(symbols[3]);
    }
}
