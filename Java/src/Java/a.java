package Java;

import java.util.Scanner;

public class a 
{

	
	public static void main(String[] args) 
	{
		String s = "";	
		Scanner in = new Scanner(System.in);
		s= in.nextLine();
		
		StringBuffer Stringreverse = new StringBuffer(s);
	    System.out.println("Rever String Data:  "+ Stringreverse.reverse()); 
	} 
}
