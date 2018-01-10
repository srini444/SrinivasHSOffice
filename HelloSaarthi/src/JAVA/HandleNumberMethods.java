package JAVA;


public class HandleNumberMethods {

	public static void main(String[] args) {
	
		//Integer Object Method
		int a = 10;
		Integer x = a;						//Integer is class(java.lang.Integer)
		System.out.println(x.equals(5));
		
		//abs() Method
		double b = 3.12;
		double c = -4.12;
		System.out.println(Math.abs(b));	//Math is class(java.lang.Math)
		System.out.println(Math.abs(c));
		
		//round() Method
		double d = 5.12;
		double e = 6.8;
		System.out.println(Math.round(d));
		System.out.println(Math.round(e));
		
		//min() Method
		int f = 1;
		int g = 2;
		System.out.println(Math.min(f, g));
		
		//max() Method
		int h = 5;
		int i = 8;
		System.out.println(Math.max(h, i));
		
		//random() Method
		System.out.println(Math.random());
	}

}
