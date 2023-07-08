package cwiczenia.iterator.lewicki;

public class Tablica<T> implements Kontener
 {
	private static int DOMYSLNA_POJEMNOSC = 10;
	
	private T magazyn[];
	
	@SuppressWarnings("unchecked")
	public Tablica(int n)
	{
	  this.magazyn = (T[]) new Object[n];
	}
	
	public Tablica()
	{
	  this(DOMYSLNA_POJEMNOSC);
	}
	
	public void set(int index, T elem) 
	{
	  this.magazyn[index] = elem;
	}
	
	public T get(int index) 
	{
	  return magazyn[index];
	}
	
	public int size()
	{
	 return magazyn.length;
	}
	
	public Iterator getIterator()
	{
		return new IteratorTablicy();
	}
	
 private class IteratorTablicy implements Iterator 
  {
    int index;
		
    public boolean hasNext()
    {
	  if(index < magazyn.length)
	   {
	    return true;
	   }
      return false;
	}
		
	public T next() 
	{
	 if(this.hasNext())
	  {
	    return magazyn[index++];
	  }
	 return null;
	}
		
	public boolean czyKoniec() 
	 {
       if(index == magazyn.length)
    	{
	     return true;
    	}
	   return false;
	 }
		
	public int aktualny()
	{
	 return index;
	}
		
  }
}
