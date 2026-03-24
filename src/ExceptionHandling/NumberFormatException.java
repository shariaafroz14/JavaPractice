package ExceptionHandling;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      String s= "12345";
		      System.out.println(s+5);
		      int i =Integer.parseInt(s);
		      System.out.println(i+5);
		      String s1="123Abc23";
		      int j= Integer.parseInt(s1);
		      System.out.println(j+5);

	}

}
