package JavaPrograms;

import java.util.Scanner;

public class SumOfNnumbers 
{

	
	public static void main(String[] args) 
	{
	
		int n;
		int temp=1;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value for 'n':");
		n=in.nextInt();
		
		for(int i=0 ; i<n; i++) {
			temp = temp+1;
			
		}
		System.out.println("The Sume upto"+ n +"is: " +temp);
	
	}

}
