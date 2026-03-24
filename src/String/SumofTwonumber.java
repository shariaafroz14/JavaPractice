package String;

public class SumofTwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    int a=10;
		    int b=20;
		    
		    System.out.println("Befor: a="+a+",b="+b);
		    
		    //method1: using Arithmetic operation//
		    
		    a=a+b;
		    b=a-b;
		    a=a-b;
		    //method2: using XOR (alternative)
		    a=a+b;
		    b=a^b;
		    a=a^b;
		    
		    System.out.println("After: a="+a+",b="+b);
		    
		    
	}

}
