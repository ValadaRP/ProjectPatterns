package cwiczenia.interpreter.cwiczenia.zad2;

public class HexadecimalNumber implements Expression {
    private final String hexValue;

    public HexadecimalNumber(String hexValue) {
        this.hexValue = hexValue;
    }

    @Override
    public int interpret() {
        return Integer.parseInt(hexValue, 16);
    }
}