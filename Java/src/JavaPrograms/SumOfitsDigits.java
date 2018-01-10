package JavaPrograms;

import java.util.Scanner;

public class SumOfitsDigits 
{

	
	public static void main(String[] args) 
	{
	
		Scanner in = new Scanner(System.in);
		int input;
		
		System.out.println("Enter the Value to calculate its sum: ");
		
		input = in.nextInt();
		int sum = 0;
		while(input !=0) {
			
			int lastdigit = input %10;
			sum = sum+ lastdigit;
			
			input = input /10;
			
		}
		
		System.out.println("Sum of its digit is " +sum);
	}

}
