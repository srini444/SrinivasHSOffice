package JavaPrograms;

import java.util.Scanner;

public class Factorial 
{

	
	public static void main(String[] args) 
	{
	
		Scanner in = new Scanner(System.in);
		int input;
		System.out.println("Enter The value to find factorial: ");
		input = in.nextInt();
		
		int result=1;
		while(input>0) {
			result = result*input;
			input--;
			
		}
		System.out.println("Factorial of the given no is "+ result); 
	}

}