package zadania.interpreter.ex1;

public class StudySpec implements Expression {


    @Override
    public String interpret(String context) {
        switch (context) {
            case "IPO":
                return "Inzynieria produkcji oprogramowania";
            case "CYB":
                return "Cyberbezpieczenstwo";
            case "LOG":
                return "Logistyka";
            case "OCH":
                return "Ochrona";
            case "MAT":
                return "Matematyka sstosowana";
            default:
                return "Nieznany kierunek";
        }
    }
}
