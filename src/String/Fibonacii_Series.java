package String;

public class Fibonacii_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int n=10;// number of fibonacii numbers to print
		   int a = 0, b=1;
		   
		   System.out.println(a+""+b+"");
		   for (int i=2;i<n;i++) {
			   int c=a+b;
			   System.out.println(c+"");
			   a=b;
			   b=a;
		   }
		   

	}

}
