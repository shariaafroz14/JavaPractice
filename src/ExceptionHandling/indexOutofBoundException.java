package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class indexOutofBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    List<Integer> ex=new ArrayList<Integer>();
		    ex.add(10);
		    ex.add(20);
		    ex.add(30);
		    ex.add(40);
		    ex.add(40);
		    
		    System.out.println(ex.get(3));
		    System.out.println(ex.get(10));
		    

	}

}
