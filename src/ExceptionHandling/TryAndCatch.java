package ExceptionHandling;

public class TryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    System.out.println("Stars");
		    System.out.println("1");
		    System.out.println("2");
		    System.out.println("3");
		    
		    try {
		    	System.out.println(10/0);}
		    catch (ArithmeticException e) {
		    	System.out.println("dont/by zero");
		    }
		    System.out.println("4");
		    System.out.println("5");
		    System.out.println("End");
		    
		    
		    }

	}


