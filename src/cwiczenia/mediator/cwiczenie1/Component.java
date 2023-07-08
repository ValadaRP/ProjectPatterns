package cwiczenia.mediator.cwiczenie1;

public abstract class Component {
    protected Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendEvent(String event) {
        mediator.notify(event);
    }

    public abstract void handleEvent(String event);
}
