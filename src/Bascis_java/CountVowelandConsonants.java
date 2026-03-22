package Bascis_java;

public class CountVowelandConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s="hello";int v=0,c=0;
		 s=s.toLowerCase();
		 for(int i=0;i<s.length();i++) 
		 {
			 char ch=s.charAt(i);
			 if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				 v++;
			 }
			 else if(ch>='a'&& ch<='z') {
				 c++;
			 }
		 }
	 System.out.println("vowels:"+v);
	}
}
