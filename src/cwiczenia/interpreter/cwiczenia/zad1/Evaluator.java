package cwiczenia.interpreter.cwiczenia.zad1;

import java.util.ArrayList;
import java.util.List;

public class Evaluator implements Expression {
    private List<Expression> expressions;

    public Evaluator(String expression) {
        expressions = new ArrayList<>();
        for (String token : expression.split(" ")) {
            Expression exp = createExpression(token);
            expressions.add(exp);
        }
    }

    @Override
    public String interpret() {
        StringBuilder result = new StringBuilder();
        for (Expression expression : expressions) {
            result.append(expression.interpret()).append(" ");
        }
        return result.toString().trim();
    }

    private Expression createExpression(String token) {
        Expression expression;
        if (token.matches("\\d+")) {
            expression = new Semester(token);
        } else if (token.equals("U")) {
            expression = new SupplementaryStudies(token);
        } else if (token.equals("I") || token.equals("N")) {
            expression = new FieldOfStudy(token);
        } else if (token.equals("D") || token.equals("N")) {
            expression = new StudyMode(token);
        } else {
            expression = new Specialization(token);
        }
        return expression;
    }
}
