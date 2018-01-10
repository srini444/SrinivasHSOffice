package JavaPrograms;

import java.util.Scanner;

public class ReverseTheNumber 
{

	
	public static void main(String[] args) 
	{
	
		int num;
		int reminder;
		int result=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter num :");
		num= in.nextInt();
		
		while(num>0) {
			reminder =num%10;
			result= result*10 + reminder;
			num=num/10;
			
		}
		System.out.println("Reverse of the Number is : "+result);
	}

}
