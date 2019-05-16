import java.util.Random;

public class Die 
{
	private int dieValue;
	public Die()
	{
		dieValue=0;
	}
	
	public int roll()
	{
		Random rand= new Random();
		dieValue= (rand.nextInt(6)+1);
		return dieValue;
	}
	
	public int getValue()
	{
		return dieValue;
	}
	
	
	
	
	
}
