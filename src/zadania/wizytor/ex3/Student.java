package zadania.wizytor.ex3;

public class Student extends Element{
    private double srednia = 2.0;
    private boolean pierwszyTermin = false;
    private boolean laureatOlimpiady = false;

    private boolean zwolnienieCzesne = false;
    private boolean karnetSilownia = false;
    private boolean karnetStrzelnica = false;
    private int limitBiblioteka = 10;

    public Student(double srednia, boolean pierwszyTermin, boolean laureatOlimpiady) {
        this.srednia = srednia;
        this.pierwszyTermin = pierwszyTermin;
        this.laureatOlimpiady = laureatOlimpiady;

    }

    public boolean czyPrzyslugujeZwolnienie() {
        return srednia > 4.75 || (srednia >= 4.5 && pierwszyTermin) || laureatOlimpiady;
    }

    public double getSrednia() {
        return srednia;
    }

    public void setSrednia(double srednia) {
        this.srednia = srednia;
    }

    public boolean isPierwszyTermin() {
        return pierwszyTermin;
    }

    public void setPierwszyTermin(boolean pierwszyTermin) {
        this.pierwszyTermin = pierwszyTermin;
    }

    public boolean isLaureatOlimpiady() {
        return laureatOlimpiady;
    }

    public void setLaureatOlimpiady(boolean laureatOlimpiady) {
        this.laureatOlimpiady = laureatOlimpiady;
    }

    public boolean isZwolnienieCzesne() {
        return zwolnienieCzesne;
    }

    public void setZwolnienieCzesne(boolean zwolnienieCzesne) {
        this.zwolnienieCzesne = zwolnienieCzesne;
    }

    public boolean isKarnetSilownia() {
        return karnetSilownia;
    }

    public void setKarnetSilownia(boolean karnetSilownia) {
        this.karnetSilownia = karnetSilownia;
    }

    public int getLimitBiblioteka() {
        return limitBiblioteka;
    }

    public void setLimitBiblioteka(int limitBiblioteka) {
        this.limitBiblioteka = limitBiblioteka;
    }

    public boolean isKarnetStrzelnica() {
        return karnetStrzelnica;
    }

    public void setKarnetStrzelnica(boolean karnetStrzelnica) {
        this.karnetStrzelnica = karnetStrzelnica;
    }

    @Override
    public void wizytuj(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "srednia=" + srednia +
                "\npierwszyTermin=" + pierwszyTermin +
                "\nlaureatOlimpiady=" + laureatOlimpiady +
                "\nzwolnienieCzesne=" + zwolnienieCzesne +
                "\nkarnetSilownia=" + karnetSilownia +
                "\nkarnetStrzelnica=" + karnetStrzelnica +
                "\nlimitBiblioteka=" + limitBiblioteka +
                '}';
    }
}
