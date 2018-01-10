package JavaPrograms;

import java.util.Scanner;

public class ArmstrongNumber 
{

	
	public static void main(String[] args) 
	{
	
		int num;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter num: ");
		num = in.nextInt();
		
		int a= num;
		int check =0;
		int reminder;
		
		while(num>0) {
			reminder = num%10;
			check = check + (int)Math.pow(reminder, 3);
			num = num/10;
			
		}
			if(check==a) 
				System.out.println(a  + "  is an Armstrong Number");
			else
				System.out.println(a  + "  is not an Armstrong Number");
		
	}

}
