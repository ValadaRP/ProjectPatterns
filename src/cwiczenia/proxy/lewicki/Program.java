package cwiczenia.proxy.lewicki;

public class Program 
{
	
	public static void main(String[] args) 
	{
	   Obraz obraz = new ObiektProxy("zdjecie_8mb.jpg");

       obraz.wyswietl();
  	   System.out.println("");
	   obraz.wyswietl();
	}
 }