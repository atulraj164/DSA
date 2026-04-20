package treeimplementation;

import java.util.*;


public class BinaryTree {
     node root=null;
     
     public void add(int data) {
    	 if(root==null) {
    		 root=new node(data);
    		 return;
    	 }
    	  
    	 Queue<node>treequeue=new LinkedList<>();
    	 treequeue.add(root);
    	 
    	 while(!treequeue.isEmpty()) {
    		 node temp=treequeue.poll();
    		 if(temp.left==null) {
    			 temp.left=new node(data);
    			 return;
    		 }else {
    			 treequeue.add(temp.left);
    		 }
    		 if(temp.right==null) {
    			 temp.right=new node(data);
    			 return;
    		 }else {
    			 treequeue.add(temp.right);
    		 }
    	 }
     }
     
     
     public void inorder(node curr) {
    	
    	  if(curr==null) {
    		  return;
    	  }
    	  
    	  inorder(curr.left);
    	  System.out.println(curr.data);
    	  inorder(curr.right);
   
    	  
     }
     public void preorder(node curr) {
     	
   	  if(curr==null) {
   		  return;
   	  }
   	System.out.println(curr.data);
   	  inorder(curr.left);
   	  inorder(curr.right);
  
   	  
    }
     public void postorder(node curr) {
      	
      	  if(curr==null) {
      		  return;
      	  }
     
      	  inorder(curr.left);
      	  inorder(curr.right);
      	System.out.println(curr.data);
     
      	  
       }
}
