package JavaPrograms;



public class Generate5Integers 
{

	// write a program to generate 5 random integer number b/w 1 to 50?
	public static void main(String[] args) 
	{
	
		for(int i=1; i<=5; i++) 
		{
			System.out.println((int) (Math.random()*50));
		}
	
	}

}
