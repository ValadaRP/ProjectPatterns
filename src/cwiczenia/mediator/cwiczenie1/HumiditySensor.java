package cwiczenia.mediator.cwiczenie1;

public class HumiditySensor extends Component{
    public HumiditySensor(Mediator mediator) {
        super(mediator);
    }

    public void measureHumidity() {
        int humidity = 0;
        if (humidity < 30) {
            sendEvent("LowHumidity");
        }
    }

    @Override
    public void handleEvent(String event) {
        if (event.equals("LowHumidity")) {
            System.out.println("HumiditySensor: Low humidity detected");
        }
    }
}
