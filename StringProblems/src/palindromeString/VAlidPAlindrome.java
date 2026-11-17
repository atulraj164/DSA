package palindromeString;

public class VAlidPAlindrome {
	
	
	public static boolean checkPalindrome(String s) {
		s=s.toLowerCase();
		int i=0;
		int j=s.length()-1;
				
		while(i<j) {
			if(!Character.isLetterOrDigit(s.charAt(i))) {
				i++;
			}
			else if(!Character.isLetterOrDigit(s.charAt(j))) {
				j--;
			}
			else if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	
	
 public static void main(String[] args) {
	 String s = "A man, a plan, a canal: Panama";
	 System.out.println(checkPalindrome(s));
}
}
