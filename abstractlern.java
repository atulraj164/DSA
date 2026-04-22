package hashmap;

import hashmap.abstractlern.outer;

abstract class toy{
	abstract int car();
	abstract int planes();
}
class animal{
	
}

interface human{
	public void living();
	public void notliving();
	public default void sometime() {
		System.out.println("sustain");
	}
}
class toyata implements human{
	@Override
	public void living() {
		
	}public void notliving() {
		
	}public void sometime() {
		
	}
}


class toydata extends toy implements human{
	
	@Override
	public int car() {
		return 25;
	}
	public int planes() {
		return 20;
	}
	public void toys() {
		System.out.println("car,planes");
	}
	@Override
	public void living() {
	 System.out.println("notliving");	
	}
	@Override
	public void notliving() {
		System.out.println("living");
	}
	static void classcode() {
		System.out.println("belongs to the class");
	}
}


interface woman{

	public boolean married();
	
}
public class abstractlern{
	
	static class inner{
		public void show() {
			System.out.println("inner");
		}}
	
		 class outer{
			public void show() {
				System.out.println("outer");
			}
	}
	
	public static void main(String[] args) {
		
	  //inner in=new abstractlern.inner();	
	  
	//  abstractlern abs=new abstractlern();
	//  outer out=abs.new outer();
	  
	  woman w=()->true;
	  System.out.println(w.married());
	  
	  
	

	}
	
	
}

