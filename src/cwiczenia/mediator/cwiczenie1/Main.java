package cwiczenia.mediator.cwiczenie1;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new SmartHomeMediator();

        // Tworzenie komponentów
        Component humiditySensor = new HumiditySensor(mediator);
        Component airQualitySensor = new AirQualitySensor(mediator);

        // Dodawanie komponentów do mediatora
        mediator.addComponent(humiditySensor);
        mediator.addComponent(airQualitySensor);

        // Przykładowa logika monitorowania
        ((HumiditySensor) humiditySensor).measureHumidity();
        ((AirQualitySensor) airQualitySensor).measureCO2();
    }
}
