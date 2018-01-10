package JavaPrograms;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) 
	{
	int radius;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the radius of the circle");
	radius = in.nextInt();
	double area = Math.PI*radius*radius;
	System.out.println("Araa of the circle is "+ area);
	
	}

}
