package arraysolution;

public class MaximuAvgSubArray {
	class Solution {
	    public double findMaxAverage(int[] nums, int k) {
	        double avg=Integer.MIN_VALUE;
	         double sum=0;
	        for(int i=0;i<k;i++){
	           sum+=nums[i];
	        }
	     avg=(sum/k);

	        if(nums.length==k){
	           return avg;
	        }
	         int j=0;
	        for(int i=k;i<nums.length;i++){
	           
	        sum=sum-nums[j];
	            sum=sum+nums[i];
	            j++;
	             if(avg<=(sum/k)){
	           avg=sum/k;
	        }
	        }
	        return avg;
	    }
	}
}
