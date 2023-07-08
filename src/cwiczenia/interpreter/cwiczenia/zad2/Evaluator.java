package cwiczenia.interpreter.cwiczenia.zad2;

import java.util.HashMap;
import java.util.Map;

public class Evaluator {
    private Map<String, Expression> variables;

    public Evaluator() {
        variables = new HashMap<>();
    }

    public void setVariable(String name, Expression expression) {
        variables.put(name, expression);
    }

    public Expression getVariable(String name) {
        return variables.get(name);
    }
}
