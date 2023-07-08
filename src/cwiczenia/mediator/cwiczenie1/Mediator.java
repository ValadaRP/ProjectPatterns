package cwiczenia.mediator.cwiczenie1;

public interface Mediator {
    void addComponent(Component component);
    void notify(String event);
}
