package Bascis_java;

public class FindMAxAndmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int[]a= {3,9,1,5};
		  int max=a[0],min=a[0];
		  for(int n:a) {
			  if(n>max)max=n;
			  if(n<min)min=n;
		  }
		  System.out.println("max:"+max+"min:"+min);
			  
		  }
				  

	}


