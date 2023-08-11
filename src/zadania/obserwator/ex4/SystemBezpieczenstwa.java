package zadania.obserwator.ex4;

public class SystemBezpieczenstwa extends SystemType {

    public SystemBezpieczenstwa(Mediator mediator, String name) {
        super(mediator, name);

    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " wysyla wiadomosc: " + message);
        mediator.notify(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println("System bezpieczenstwa otrzymal wiadomosc: " + message);
    }
}
