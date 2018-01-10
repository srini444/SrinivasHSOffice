package Java;

public class ArrayMulti {

	public static void main(String[] args) 
	{
	
		int [][] myList= new int[4][3];
		int temp=10;
		
		for(int i=0; i<4; i++) {
			for(int j = 0; j<3; j++) {
				myList[i][j]=temp;
				temp = temp+10;
				System.out.println("Value  "+myList[i][j]+  "");
				System.out.println();
			}
			System.out.println();
		}
	}

}
