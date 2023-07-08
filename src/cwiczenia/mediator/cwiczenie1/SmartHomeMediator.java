package cwiczenia.mediator.cwiczenie1;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeMediator implements Mediator{
    private List<Component> components = new ArrayList<>();
    @Override
    public void addComponent(Component component) {
        this.components.add(component);
    }

    @Override
    public void notify(String event) {
        for (Component component : components) {
            component.handleEvent(event);
        }
    }
}
