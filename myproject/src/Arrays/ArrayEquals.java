package Arrays;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[] {'a', 'b', 'c', 'd', 'e'};   
		int[] array2 = new int[] {'a', 'b', 'c', 'd'};  
		
		if (Arrays.equals(array1, array2))   
		System.out.println("Arrays are equal.");   
		else  
		System.out.println("Arrays are not equal.");   
		}   
		

	}

