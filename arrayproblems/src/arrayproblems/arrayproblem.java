package arrayproblems;
import java.util. Scanner;

class node{
	int value;
	node next;
	
	public node(int value) {
		this.value=value;
	}
}

class linkedlist{
	node tail;
	node first;
	public linkedlist(int data) {
		first=new node(data);
		tail=first;
	}
	  
	public void addattail(int value) {
		node temp=new node(value);
		tail.next=temp;
		tail=temp;
	}
	public void iterate() {
		node temp=this.first;
		while(temp!=null) {
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
}




public class arrayproblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	
	String d="[1,2,3,4,5]";
	
			
			
	}}
