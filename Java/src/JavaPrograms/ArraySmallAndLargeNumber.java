package JavaPrograms;



public class ArraySmallAndLargeNumber 
{

	
	public static void main(String[] args) 
	{
	
		int numArray[] = new int [] {55, 65, 45, 95, 75, 3, 1 , 0};
		
		int smallNo = numArray[0];
		int largeNo = numArray[0]; 
		
		for(int i=1; i< numArray.length; i++) {
			if(numArray[i]>largeNo)
				largeNo = numArray[i];
			else if (numArray[i]<smallNo)
			smallNo = numArray[i];
		}
				

		System.out.println("Largest Number is  : "+  largeNo);
		System.out.println("Smallest Number is : "+  smallNo);
	}
	

}
