package JAVA;

public class HandleStringMethods {

	public static void main(String[] args) {
	
		//equals Method
		String s1 = "selenium";
		String s2 = "SELENIUM";
		System.out.println(s1.equals(s2));
		
		//concat Method
		String s3 = "Selenium";
		String s4 = "Testing";
		System.out.println(s3.concat(s4));

		//charAt() Method
		String s5 = "Selenium";
		System.out.println(s5.charAt(1));
		
		//equalsIgnorecase() Method
		String s6 = "selenium";
		String s7 = "SELENIUM";
		System.out.println(s6.equalsIgnoreCase(s7));
		
		//toUppercase() Method
		String s8 = "seleium";
		System.out.println(s8.toUpperCase());
		
		//toLowercase() Method
		String s9 = "SELENIUM";
		System.out.println(s9.toLowerCase());
		
		//trim() Method
		String s10 = "	SELENIUM	";
		System.out.println(s10.trim());		
		
		//substring() Method
		String s11 = "SELENIUM TESTING";
		System.out.println(s11.substring(5));
		System.out.println(s11.substring(0,8));
		
		//endsWith() Method
		String s12 = "SELENIUM TESTING";
		System.out.println(s12.endsWith("TESTING"));
		
		//length() Method
		String s13 = "SELENIUM TESTING";
		System.out.println(s13.length());	
		
	}

}
