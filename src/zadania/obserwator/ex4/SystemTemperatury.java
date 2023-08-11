package zadania.obserwator.ex4;

public class SystemTemperatury extends SystemType {
    public SystemTemperatury(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void send(String message) {
        System.out.println(this.name + " wysyla wiadomosc: " + message);
        mediator.notify(this, message);
    }

    @Override
    void receive(String message) {
        System.out.println("System temperatury otrzymal wiadomosc: " + message);
    }
}
