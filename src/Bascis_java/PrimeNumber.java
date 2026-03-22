package Bascis_java;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		   int n= 29,flag=0;
		   for(int i=2;i<=n/2;i++) {
			   if(n%i==0) {flag=1;break;}
		   }
		   System.out.println(flag==0?"prime":"not prime");
	}

			   
		   

	}


