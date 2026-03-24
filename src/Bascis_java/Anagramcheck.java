package Bascis_java;

import java.util.Arrays;

public class Anagramcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String s1="listen",s2="silent";
		  char[] a1=s1.toCharArray();
		  char[] a2=s2.toCharArray();
		  
		  Arrays.sort(a1);
		  Arrays.sort(a2);
		  
		  System.out.println(Arrays.equals(a1, a2)?"Anagram":"not Anagram");

	}

}
