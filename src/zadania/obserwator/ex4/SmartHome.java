package zadania.obserwator.ex4;

import java.util.ArrayList;
import java.util.List;

public class SmartHome implements Mediator {
    List<SystemType> systems;

    public SmartHome() {
        systems = new ArrayList<>();
    }

    @Override
    public void notify(SystemType systemType, String message) {
        for (SystemType system : systems) {
            if (system != systemType) {
                system.receive(message);
            }
        }

    }

    @Override
    public void addSystem(SystemType systemType) {
        systems.add(systemType);
    }
}
