package Class1ToClass13;

public class reverse {

	public static void main(String[] args) 
	{
		  StringBuffer a = new StringBuffer("I like java very much.");
		  // use reverse() method to reverse string
		  System.out.println(a.reverse());
		  
		  
		  
		  int f1 = 0;
		  int f2 = 1;
		  int sum = 0;
		  for(int i=0; i<=21;)
		   {
		   System.out.println(f1);
		   sum = i+f2;
		   f2=i;
		   f1=sum;
		   i=f1;
		   }

		  
		  int sum1 = 0;  
		  for (int i=5;i>=1;i--){      
		   if(i%2!=0){
		    if(sum1<(i*i)){
		     sum1 = (i*i)-sum;
		    }else{
		     sum1 = sum1-(i*i);
		    }    
		   }else{    
		    sum1 = sum1+(i*i);
		   }    
		  }
		  System.out.println(sum1);

		  
		  

	}

}
