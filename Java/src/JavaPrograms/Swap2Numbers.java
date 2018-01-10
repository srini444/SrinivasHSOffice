package JavaPrograms;

public class Swap2Numbers 
{

	public static void main(String[] args) 
	{
	
		int num1 = 100;
		int num2 = 50;
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("num1 is "+num1);
		System.out.println("num2 is "+num2);
		
	}

}
