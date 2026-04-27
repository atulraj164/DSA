package question;

public class question {
   public static void main(String[] args) {
	 int min;
	 int min2;
	 int arr[]= {2,1,3,4,5};
	 int size=arr.length;
	
	  min=arr[0];
	  min2=arr[0];
	for(int i=1;i<size;i++){
	     if(min>i) {
	    	 min2=min;
	    	 min=arr[i];
	     }
	}
	System.out.println(min+"     "+min2);
	  	

}
}
