package arrayproblems;

public class insertionSort {
	public static void runArray(int[] arr) {
		 for(int i :arr) {
			 System.out.println(i);
		 }
	}
  public static void main(String[] args) {
	int [] arr= {5,2,7,1,6};
	
	for(int i=1;i<arr.length;i++) {
		int piviot=arr[i];
		int j=i-1;
		while(j>=0 && piviot>arr[j]) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=piviot;
		
	}
   
}
}
