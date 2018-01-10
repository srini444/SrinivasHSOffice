package JAVA;

import java.util.Arrays;

public class HandleArrayMethods {

	public static void main(String[] args) {
	
		//length() Method
		int[] arr1 = {1,2,3,4,5};
		System.out.println(arr1.length);
		
		//toString() Method
		String[] arr2= {"selenium", "Appium"};
		String str1 = Arrays.toString(arr2);		//Arrays is class
		System.out.println(str1);
		
		//contains() Method
		String[] arr3= {"selenium", "appium"};
		boolean a = Arrays.asList(arr3).contains("appium");		//asList is property
		boolean b = Arrays.asList(arr3).contains("jmeter");
		System.out.println(a);
		System.out.println(b);
		
	}

}
