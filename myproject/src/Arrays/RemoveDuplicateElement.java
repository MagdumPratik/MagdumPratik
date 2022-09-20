package Arrays;

import java.util.HashSet;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] a = {10,20,20,30,50,50}; 
      HashSet<Integer> hs = new HashSet<>();
      for(int i=0; i<a.length; i++) {
    	  hs.add(a[i]); 
    	  
    	  for (int no:hs) {
    	   System.out.println(no + " ");
    	  }
    	  
      }

}}
