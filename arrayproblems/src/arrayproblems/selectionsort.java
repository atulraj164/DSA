package arrayproblems;

public class selectionsort {
 public static void main(String[] args) {
	 int [] arr= {5,2,7,1,6};
	 
	/* for(int i=0;i<arr.length;i++) {
		 int piviot=arr[i];
		 for(int j=i+1;j<arr.length;j++) {
			 if(arr[j]<piviot) {
				 int temp=arr[j];
				 arr[j]=piviot;
				 piviot=temp;
			 }
		 }
		 arr[i]=piviot;
	 }*/
	 
	 //actual insertion
	 
	 for(int i=0;i<arr.length;i++) {
		 int minElement=arr[i];
		 int minIndex=i;
		 for(int j=i+1;j<arr.length;i++) {
			 if(minElement>arr[j]) {
				 minElement=arr[j];
				 minIndex=j;
				 
			 }
		 }
		 arr[minIndex]=arr[i];
		 arr[i]=minElement;
		 
		 
	 }
	 
	 for(int i :arr) {
		 System.out.println(i);
	 }

}
}
