package Java;
public class instanceVariables 
  {
		int age; 
	   public void pupAge() 
	   {
	      
	      age = age + 20;
	      System.out.println("Puppy age is : " + age);
	   }

	   public static void main(String args[]) {
	      instanceVariables test = new instanceVariables();
	      test.pupAge();
	   }
	}