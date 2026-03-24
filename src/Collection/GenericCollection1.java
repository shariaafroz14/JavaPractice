package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericCollection1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		   ArrayList<String>name=new ArrayList<String>();
		   name.add("admas");
		   name.add("jhon");
		   name.add("nike");
		   
		   System.out.println("Generic Collection is :"+name);
		   name.sort(null);
		   System.out.println("After sorting is : "+name);
		   System.out.println("before sorting is :"+name);
		   
		   Iterator it = name.iterator();
		   while(it.hasNext())
		   {
			   System.out.println(it.next());
			   Thread.sleep(1000);
		   }
		   

	}

}
