package arraysolution;
import java.util.HashMap;
public class MajorityElement {
	public static void main(String[] args) {
		
	
	int[] arr= {1,2,3,4,4,4,4};
	HashMap<Integer,Integer>map=new HashMap<>();
	
	for(int n:arr) {
		int k=map.getOrDefault(n, 0)+1;
		map.put(n,k);
		if(k>(arr.length/2)) {
			System.out.println(k);
		}
	}
	}
}
