package JAVA;

public class HandleCharMethods {

	public static void main(String[] args) {
	
		//isLetter() Method
		char a = 'x';
		char b = '1';
		System.out.println(Character.isLetter(a));		//Character is class
		System.out.println(Character.isLetter(b));
		
		//isDigit() Method
		char c = 'y';
		char d = '1';
		System.out.println(Character.isDigit(c));
		System.out.println(Character.isDigit(d));
		
		//isUppercase() Method
		char e = 'Y';
		char f = 'y';
		System.out.println(Character.isUpperCase(e));
		System.out.println(Character.isUpperCase(f));
		
		//isLowercase() Method
		char g = 'y';
		char h = 'Y';
		System.out.println(Character.isLowerCase(g));
		System.out.println(Character.isLowerCase(h));
		
		
	}

}
