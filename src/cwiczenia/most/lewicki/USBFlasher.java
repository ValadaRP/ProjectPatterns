package cwiczenia.most.lewicki;

public class USBFlasher extends Flasher
{
	public USBFlasher(USBDevice aDevice) 
    {
      super(aDevice);
    }

	public void communicateViaProtocall() 
	{
        System.out.println("system komunikuje si� z urz�dzeniem portu szeregowego");
    }
    
	public void flashDevice()
	{
      System.out.println("urz�dzenie "+myDevice.getType()+" portu szeregowego sygnalizuje prac�");
    }
}