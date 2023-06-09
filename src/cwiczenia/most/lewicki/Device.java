package cwiczenia.most.lewicki;

public abstract class Device 
{
	protected String type="Urz�dzenie";
	protected boolean deviceConnectionStatus=false;
	public String getType() 
	{
		return type;
	}
	
	public void connectDevice()
	{
		System.out.println("urz�dzenie jest pod��czone"); 
		deviceConnectionStatus=true;
	}

	public abstract boolean validateDevice();

	public void ejectDevice()
	{
		System.out.println("usuwanie z portu....");
		deviceConnectionStatus=false;
	} 
}