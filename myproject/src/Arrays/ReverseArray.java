package Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] x= {1,2,3,4,5,6,7,8,9,10};
      System.out.println("Element before reverse order:");
      
      for(int i=0; i<x.length; i++) {
    	  System.out.println(x[i]+ " ");
      }
      System.out.println("\n\nElement before reverse order:");
      
      for(int i=x.length-1; i>=0; i--) {
    	  System.out.println(x[i]+ " ");
    	  
    	  
      }
	}

}
