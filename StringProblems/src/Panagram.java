package StringProblem;

public class Panagram {
 public static void main(String[] args) {
	  String str = "The quick brown fox jumps over the lazy dog";
	  str=str.replace(" ", "").toLowerCase();
	  System.out.println(str);
	  
	  int[] fre=new int[26];
	  for(int i=0;i<str.length();i++) {
		  fre[str.charAt(i)-'a']++;
	  }
	  for(int count:fre) {
		  if(count==0) {
			  System.out.println("not panagram");
			  return;
		  }
	  }
	  System.out.println("panagram");
}
}
