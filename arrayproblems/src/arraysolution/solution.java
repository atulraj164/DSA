package arraysolution;



public class solution {
	public class obj{//non-static//for static just use static keyword to create class
		int value;
	}
	
	
   public static void main(String [] args) {
       int value = new solution().calculate(4);
	   System.out.println(value);
	   solution sol=new solution();
	  obj i=sol.new obj(); //non static class decleration;
	  i.value=5;
	  obj j=sol.new obj();
	   j.value=7;
	   System.out.println("before swaping value of i="+i.value+ " value of j="+ j.value);
	 new solution().swap(i, j);
	   System.out.println("after swaping value of i="+i.value+ " value of j="+ j.value);
   }


public int calculate(int n){
	return n*n;
}
public void swap (obj i,obj j){
	int temp=i.value;
	i.value=j.value;
	j.value=temp;
	
}

}
