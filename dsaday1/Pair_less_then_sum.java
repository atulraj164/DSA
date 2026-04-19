package dsaday1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pair_less_then_sum {
   
	public static void main(String [] args) {
	List<Integer>list=Arrays.asList(-1,1,2,3);
	
	//brut force
	int target=2;
	int count=0;
	for(int i=0;i< list.size();i++) {
		if(list.get(i)<target) {
		for(int j=0;j<list.size();j++) {
			if(list.get(i)+list.get(j)<target && i!=j) {
				count++;
			}
		}
	}
	}
	
	
	
	//best approach
	Collections.sort(list);
	int count2=0;
	int i=0;
	int j=list.size()-1;
	
	while(i<j) {
		if(list.get(i)+list.get(j)<target) {
			count2=count2+(j-i);
			i++;
		}else {
			j--;
		}
	}
	System.out.println(count2);
	
	
	
}}
