package Java;

public class Arrays {

	public static void main(String[] args) 
	{
		int myList []= {10,20,30,40};
		//System.out.println("Leanth of Arrya myList is  " + myList.length);
		for(int i=0; i<myList.length; i++) {
			System.out.println("Leanth of Arrya myList is  " + myList[i] );
		}
	
		for(int temp:myList) {
			System.out.println("Value of myList is " + temp);
		}
		
		String names[]= new String[5];
		names[0]="SRINIVAS";
		names[1]="SRINI";
		names[2]="VAS";
		names[3]="SRI";
		names[4]="NIVAS";
		
		System.out.println("Length of Array"  + names.length);
		for(String getName:names) {
			System.out.println("Values of names  "+ getName);
		}
	}

}
