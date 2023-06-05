package zad1;

public class IntegerConverter implements NumberConverter{
    @Override
    public Number convert(String number) {
        return Integer.parseInt(number);
    }
}
