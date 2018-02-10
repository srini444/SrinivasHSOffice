package Java;
public class localVariable 
  {
	   public void pupAge() 
	   {
	      int age = 2;
	      age = age + 7;
	      System.out.println("Puppy age is : " + age);
	   }

	   public static void main(String args[]) {
	      localVariable test = new localVariable();
	      test.pupAge();
	   }
	}