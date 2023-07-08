package cwiczenia.mediator.cwiczenie1;

public class AirQualitySensor extends Component{
    public AirQualitySensor(Mediator mediator) {
        super(mediator);
    }
    public void measureCO2() {
        int co2Level = 1200;
        if (co2Level > 1000) {
            sendEvent("HighCO2");
        }
    }

    @Override
    public void handleEvent(String event) {
        if (event.equals("HighCO2")) {
            System.out.println("AirQualitySensor: Low air quality detected");
        }
    }
}
