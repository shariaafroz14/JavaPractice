package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkdinList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		   LinkedList l= new LinkedList();
		   
		   l.add("shariaafroz@gmail.com");
		   l.add(653);
		   l.add("sony");
		   l.add("#");
		   
		   System.out.println("peak:"+l.peek());
		   l.add(45.6);
		   System.out.println("poll:"+l.poll());
		   System.out.println("LinkedList:"+l);
		   
		   Iterator it= l.iterator();
		   while(it.hasNext());
		   {
			   System.out.println(it.next());
			   Thread.sleep(1000);
		   }
		   
		   

	}

}
