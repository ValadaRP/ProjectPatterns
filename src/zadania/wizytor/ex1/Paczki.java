package zadania.wizytor.ex1;

import java.util.ArrayList;
import java.util.List;

public class Paczki {
    private final List<Paczka> paczki = new ArrayList<Paczka>();

    public void dodaj(Paczka paczka) {
        paczki.add(paczka);
    }

    public void usun(Paczka paczka) {
        paczki.remove(paczka);
    }

    public void wizytuj(Visitor visitor) {
        for (Paczka p : this.paczki) {
            p.visit(visitor);
        }
        System.out.println();
    }

    public void displayDetails(){
        for(Paczka p:paczki){
            System.out.println(p.getType()+" "+p.getDestination()+" "+p.getCost());
        }
    }
}
