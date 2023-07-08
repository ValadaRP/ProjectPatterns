package cwiczenia.iterator.lewicki;

public class Program 
 {
	public static void main(String[] args)
	{
		Tablica<Double> kontener = new Tablica<Double>(5000);
		kontener.set(0, 0.1);
	
		int rozmiar = kontener.size();
		
		for(int i = 1; i <rozmiar; ++i)
			kontener.set(i, Double.valueOf(i));
		
		for(Iterator it = kontener.getIterator(); it.hasNext();)
		{
		  Double name = (Double)it.next();
		  System.out.println(name);
		}
	}
 }
