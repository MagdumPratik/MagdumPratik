package Arrays;

public class SortArrayAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {1, 13, 12, 9, 2};
		int temp = 0;
		
		System.out.println("Elements of original array:");

		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
			
			for(int i1 = 0; i < arr.length; i++) {
		     for(int j = i+1; j < arr.length; j++) {
		    	 if(arr[i]>arr[j]) {
		    		 temp = arr[i];
		    		 arr[i] = arr[j];
		    		 arr[i] = temp;
		    		 
		    		 System.out.println();
		    		 System.out.println("Elements of array sorted 'in 'asceding order:");
		    		 for(int i2 = 0; i < arr.length; i++) {
		    			 System.out.println(arr[i] + " ");	 
		    		 }
		    		 		
		    		 
		    	 }
		     }
			}
		}
		}}
		