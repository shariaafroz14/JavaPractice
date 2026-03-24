package Bascis_java;

import java.io.PrintStream;
import java.util.Arrays;


public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int[]a= {5,3,8,1};
		  
		  for(int i=0;i<a.length;i++) {
			  for(int j=i+1;j<a.length;j++)
				  if(a[i]>a[j]) {
					  int t=a[i]=a[j];a[j]=t;}
			 System.out.print(Arrays.toString(a));
			 
			  
			  
				  }
		  }
		  
	}


