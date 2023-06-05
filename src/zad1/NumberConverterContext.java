package zad1;

public class NumberConverterContext {
    private NumberConverter converter;

    public NumberConverterContext(NumberConverter converter) {
        this.converter = converter;
    }

    public Number convert(String number) {
        return converter.convert(number);
    }
}
