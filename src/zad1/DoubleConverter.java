package zad1;

public class DoubleConverter implements NumberConverter{
    @Override
    public Number convert(String number) {
        return Double.parseDouble(number);
    }
}
