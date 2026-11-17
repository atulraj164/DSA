package BinarySearch;

import arrayproblems.binaryserch;

public class BinarySearch {
    public static void main(String [] args) {
    	int[] arr= {1,9,7,6,4};
    	//int target=8;
    	//System.out.println(binaryserch.seling(arr,target));
    	//System.out.println(binaryserch.serch(arr,target));
    	//int key1=(binaryserch.serchfirstoccurence(arr,target,true));
    //	int key2=(binaryserch.serchfirstoccurence(arr,target,false));
    	//int range=key2-key1;
    	//System.out.println(range);
    	//if bool false then will serch lastoccurence
    	//if bool is true will serch for first occurence
       System.out.println(new binaryserch().serchpeakinmountainarray(arr));
    	
    	//    1 3 4 10 9 8 7 6 2 1
    }
    public int serchpeakinmountainarray(int[] arr) {
    	int mid=0;
    	int start=0;
    	int end=arr.length-1;
    	
    	while(start<=end) {
    		mid=start+(end-start)/2;
    		if( arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]) {
    			return start;
    		}
         	else if(arr[mid]<arr[mid+1]) {
         		start=mid+1;
    		}
    		else if(arr[mid]>arr[mid+1]) {
    			end=mid-1;
    		}
 
    	}  	
    	return start;
    }
    public static int seling(int[] arr,int target) {
    	int ans=-1;
    	int start=0;
    	int end=arr.length;
    	int mid=0;
    	while(start<=end) {
    		mid=start+(end-start)/2;
    		
    	if(arr[mid]<=target) {
    			start=mid+1;
    		}
    		else {
    			end=mid-1;
    		}
    	System.out.println("start:"+start);
    	System.out.println("end:"+end);
    	}
    	return ans;
    }
    
    public static int serchfirstoccurence(int[] arr,int target,boolean occurence) {
    	int found=-1;
    	int start=0;
    	int end=arr.length-1;
    	int mid=0;
    	while(start<=end) {
    		mid=start+(end-start)/2;
    		
    		if(arr[mid]==target) {
    			 found=mid;
    			 if(occurence) {
    				 end=mid-1;
    			 }else {
    				 start=mid+1;
    			 }
    		}
    		else if(arr[mid]>target) {
    			end=mid-1;
    		}
    		else {
    			start=mid+1;
    		}
    		
    		
    	}
  
    	return found;
    }
    public static int serch(int[] arr, int target) {
    	
    	int index=-1;
    	int start=0;
    	int end=arr.length-1;
    	int mid=0;
    	while(start<=end) {
    		mid=end+(start-end)/2;
    		if(arr[mid]==target) {
    			index=mid;
    	        return index;
    		}
    		else if(arr[mid]>target){
    			end=mid-1;
    		}
    		else {
    			start=mid+1;
    		}
    	}
    	return index;
    }
}