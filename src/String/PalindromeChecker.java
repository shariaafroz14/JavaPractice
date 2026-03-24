package String;

public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="madam";
		//if string contains caps and small letters,convert string lower or upper case//
		boolean  ispalindrme=true;
		
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1));
			ispalindrme=true;
			break;
		}
	
	System.out.println(str+"is palindrome:"+ispalindrme);
			
	}	

	}


