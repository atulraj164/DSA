package arrayproblems;

public class MergeSort {
	
	
 public static void main(String[] args) {
	  int[]arr= {5,4,2,6,9,1,3};
	  
	  mergesort(0,arr.length-1,arr);
	  for(int i:arr) {
		  System.out.print(i);
	  }
	  
}
 public static void mergesort(int start,int end,int[]arr){
	  
	 if(start>=end) {
		 return ;
	 }
	 
	 int mid=start+(end-start)/2;
	 
	 mergesort(start,mid,arr);
	 mergesort(mid+1,end,arr);
	 merge(start,mid,end,arr);
 }
 public static void merge(int start,int mid,int end,int[]arr){
	 int[] temp=new int[end-start+1];
	 
	 int i=start;
	 int j=mid+1;
	 int k=0;
	 
	 while(i<=mid && j<=end) {
		 if(arr[i]<=arr[j]) {
			 temp[k++]=arr[i++];
		 }else {
			 temp[k++]=arr[j++];
		 }
	 }
	 
	 while(i<=mid) {
		 temp[k++]=arr[i++];
	 }
	 while(j<=end) {
		 temp[k++]=arr[j++];
	 }
	 
	 for(i=0;i<temp.length;i++) {
		 arr[start++]=temp[i];
		}
 }
	  
}
