package zadania.obserwator.ex4;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new SmartHome();
        SystemType systemBezpieczenstwa = new SystemBezpieczenstwa(mediator, "System bezpieczenstwa");
        SystemType systemTemperatury = new SystemTemperatury(mediator, "System temperatury");
        SystemType systemWilgoci = new SystemWilgoci(mediator, "System wilgoci");
        mediator.addSystem(systemBezpieczenstwa);
        mediator.addSystem(systemTemperatury);
        mediator.addSystem(systemWilgoci);
        systemBezpieczenstwa.send("Zagrozenie");
        System.out.println();
        systemTemperatury.send("Za wysoka temperatura");
    }
}
