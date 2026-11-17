package BinarySearch;

public class PerfectSquareroot {
	
	public static void main(String[] args) {
		int num=54;
		boolean ans=isPerfectSquare(num);
	}
	public static boolean isPerfectSquare(int num) {
        if(num<=1){
            return true;
        }
         long low=0;
         long high=num/2;
         long mid=0;

        while(low<=high){
          mid=low+(high-low)/2;

          if((mid*mid)==num){
            return true;
          }else if((mid*mid)>num){
               high=mid-1;
          }else{
            low=mid+1;
          }

        }

        return false;
    }
}
