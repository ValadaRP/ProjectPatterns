package cwiczenia.most.lewicki;

public class SerialFlasher extends Flasher
{
public SerialFlasher(SerialDevice aDevice) 

    {
        super(aDevice);
    }
    public void communicateViaProtocall() {
        System.out.println("system komunikuje si� z urz�dzeniem USB");
    }
    public void flashDevice() {
        System.out.println("urz�dzenie "+ myDevice.getType()+" portu USB sygnalizuje prac�");
    }
}