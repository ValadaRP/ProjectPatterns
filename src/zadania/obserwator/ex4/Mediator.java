package zadania.obserwator.ex4;

public interface Mediator {
    void notify(SystemType systemType, String message);
    void addSystem(SystemType systemType);
}
