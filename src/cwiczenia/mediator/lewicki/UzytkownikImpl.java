package cwiczenia.mediator.lewicki;

public class UzytkownikImpl extends Uzytkownik
{

	public UzytkownikImpl(ChatMediator med, String nazwa) 
	{
		super(med, nazwa);
	}

	
	public void wyslij(String komunikat)
	{
		System.out.println(this.nazwa +": wys�a� wiadomo��: "+komunikat);
		mediator.wyslijWiadomosc(komunikat, this);
	}
	
	public void odbierz(String komunikat) 
	{
		System.out.println(this.nazwa +": odebrana wiadomo�� to : "+komunikat);
	}

}
