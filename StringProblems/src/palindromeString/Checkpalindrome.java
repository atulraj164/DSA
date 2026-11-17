package palindromeString;

public class Checkpalindrome {
	
	public static boolean checkPalindrome(String str) {
		str=str.toUpperCase();
		int i=0;
		int j=str.length()-1;
		while(i<=j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		return true;
	}
	
 public static void main(String[] args) {
	
	 
	 String str="maddm";
	 System.out.println(checkPalindrome(str));
	 
}
}
