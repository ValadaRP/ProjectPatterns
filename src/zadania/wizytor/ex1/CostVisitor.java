package zadania.wizytor.ex1;

public class CostVisitor implements Visitor {
    @Override
    public void visit(Paczka paczka) {
        int sum = paczka.getDestination().length() + paczka.getType().length() + (int) paczka.getWeight();
        paczka.setCost(paczka.getCost() + sum);
    }
}
