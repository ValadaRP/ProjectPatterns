package zadania.iterator.exercises.ex1;

public class Paczka extends Element {

    private String type;
    private double weight;
    private String destination;
    private double cost=0;

    public Paczka(String type, double weight, String destination) {
        this.type = type;
        this.weight = weight;
        this.destination = destination;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
