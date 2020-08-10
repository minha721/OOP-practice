package projecttt;

import java.util.Scanner;

public class projecttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter  three edges (length in double): ");
	    Scanner input = new Scanner(System.in);
	    double a = input.nextDouble();
	    double b = input.nextDouble();
	    double c = input.nextDouble();
	    
	    if((c>=a) && (c>=b))
	    {
	      if ((a + b)>c)
	         System.out.println("The perimeter is " + (a + b + c));
	      else
	         System.out.println("Input is invalid");
	    }
	      
	    else if((b>=a) && (b>=c))
	    {
	      if((a + c)>b)
	    	  System.out.println("The perimeter is " + (a + b + c));
	      else
	    	  System.out.println("Input is invalid");
	    }
	      
	    else if((a>=b) && (a>=c))
	    {
	      if((b + c)>a)
	    	  System.out.println("The perimeter is " + (a + b + c));
	      else
	         System.out.println("Input is invalid");
	    }
	}
}
