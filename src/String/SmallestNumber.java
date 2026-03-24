package String;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[]numbers= {10,3,5,13,15,3};
		 int min=numbers[0];
		 
		 for(int i=1;i<numbers.length;i++) {
			 if(numbers[i]<min) {
				 min=numbers[i];
			 }
		 }
		 System.out.println("smallest number:"+min);
			 }
		 
		 
		 

	}


