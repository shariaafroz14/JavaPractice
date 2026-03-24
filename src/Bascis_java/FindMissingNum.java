package Bascis_java;

public class FindMissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    int[]a= {1,2,3,4,5};
		    int n=5,sum = n*(n+1)/2,arrSum=0;
		    
		    for(int x:a)arrSum+=x;
		    System.out.println("missing:"+(sum-arrSum));

	}

}
