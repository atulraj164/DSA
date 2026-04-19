package dsaday1;
import java.util.*;
public class twosum_dorted {
	  public static void main(String [] args) {
		  int [] arr=new int[] {2,7,11,15};
		  
		  int []sortedtwosum=new int[] {};
		  sortedtwosum=twoSum(arr,9);
		  for(int c:sortedtwosum) {
			  System.out.println(c);
		  }
	  }
	  public static int[] twoSum(int[] numbers, int target) {
	         
		  int i=0;
	        int j=numbers.length-1;
	        
	        int sumof=0;
	        while(i<j){
	            sumof=numbers[i]+numbers[j];
	           if(sumof>target){
	            j--;
	           }else if(sumof<target){
	            i++;
	           }else if(sumof==target){
	            return new int[]{
	                i+1,j+1
	            };
	           }
	        }
	        return new int[]{-1,-1};
}}
