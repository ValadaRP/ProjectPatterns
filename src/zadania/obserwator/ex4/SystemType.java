package zadania.obserwator.ex4;

public abstract class SystemType {
    protected Mediator mediator;
    protected String name;

    public SystemType(Mediator mediator,String name) {
        this.mediator = mediator;
        this.name = name;
    }

    abstract void send(String message);

    abstract void receive(String message);
}
