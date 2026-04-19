package dsaday1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class two_sum {
   public static void main(String [] args) {
	   List<Integer>list=Arrays.asList(2,7,11,15);
	   int target=26;
	   Map<Integer,Integer>maps=new HashMap<>();
	   
	   
	   for(int i=0;i<list.size();i++) {
		    int lookingfor=target-list.get(i);
		   if(maps.containsKey(lookingfor)) {
			   System.out.println(maps.get(lookingfor)+","+i);
		   }maps.put(list.get(i),i);
	   }
   }
}
