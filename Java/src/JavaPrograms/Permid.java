package JavaPrograms;

public class Permid 
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
		
		
		System.out.println("The Pattern is");
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                if (j <= i) 
                {
                    System.out.print("  $");
                } else 
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
		
	}

}
