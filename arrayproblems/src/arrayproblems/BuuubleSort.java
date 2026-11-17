package arrayproblems;

public class BuuubleSort {
 public static void main(String[] args) {
	 int [] arr= {5,2,7,1,6};
	 
	 for(int i=0;i<arr.length;i++) {
		 for(int j=0;j<(arr.length-1);j++) {
			 if(arr[j]>arr[j+1]) {
				 int temp=arr[j+1];
				 arr[j+1]=arr[j];
				 arr[j]=temp;
			 }
		 }
	 }
	 for(int i:arr) {
		 System.out.println(i);
	 }
	 /*
	 int [] arr1= {1,1,3,3,4};
	 
	 //with flag to check sorted array
	 for(int i=0;i<arr1.length;i++) {
		 boolean flag=true;
		 for(int j=0;j<(arr1.length-1)-i;j++) {
			  if(arr1[j]>arr1[j+1]) {
				  flag=false;
				  int temp=arr1[j+1];
				  arr1[j+1]=arr1[j];
				  arr1[j]=temp;
			  }
		 }
		 if(flag) {
			 break;
		 }
	 }
	 for(int i:arr1) {
		 System.out.println(i);
	 }
	 */
}
}
