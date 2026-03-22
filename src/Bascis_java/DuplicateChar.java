package Bascis_java;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s= "helli";
		 for(int i = 0;i<s.length();i++) {
			 for(int j=i+1;i<s.length();j++) {
				 for(int k=j+1;i<s.length();k++) {
					 char c=s.charAt(i);
					 if(s.indexOf(c)!=s.indexOf(c)) {
						 System.out.println(c);
					 }
				 }
				 
			 }
		 }

	}

}
