package StringProblem;

public class Anagram {
         public static void main(String[] args) {
        	 String s1 = "listen";
        	 String s2 = "silent";
            int[] fre=new int[26];
            
            
            if(s1.length()!=s2.length()) {
            	System.out.println(false);
            	return;
            }
            for(int i=0;i<s1.length();i++) {
            	 int k=s1.charAt(i)-'a';
            	 fre[k]++;
            	 k=s2.charAt(i)-'a';
            	 fre[k]--;
            }
            
            for(int count:fre) {
            	if(count!=0) {
            		System.out.println(false);
            		return;
            	}
            }
           
           
            System.out.println(true);
		}
}
