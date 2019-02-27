package arrays;

import java.util.Arrays;

public class incrementLastDigit {

	public static void main(String[] args) {
		
		int arr[] = new int[4];
		
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 9;
		arr[3] = 9;
		
		arr = incrementedArray(arr);
		
		for(int i= 0; i< arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public static int[] incrementedArray(int[] array) {
		int result[] = new int[array.length];

		// Having a separate variable to keep track if we have carry over from previous index or not 
		boolean carry = false;
		
		// Creating a copy of the given array as we don't want to manipulate the values of the given array
		result = Arrays.copyOf(array, array.length);
		
		for(int i = (array.length-1); i >= 0; i--) {
			// First of all checking if we have carry over from previous entry or not.
			//	If we do, then do some additional checking and take apt action
			if(carry == true) {
				// If the current entry is 9, change the value to 0 only if the current index is not 0
				if(result[i] == 9) {
					// If the current index is 0, then the whole array is all 9's and you need to create a new array as the result
					if(i==0) {
						result = newArray(array.length);
						break;
					}
					result[i] = 0;
					carry = true;
					continue;
				}
				// If the current value is not 0, then increment the value and return whatever is there in the result
				else {
					result[i] += 1;
					break;
				}
			}
			
			// If the value of current entry is not 9, increment the value and return the result
			if(result[i] != 9) {
				result[i] += 1;
				break;
			}
			
			result[i] = 0;
			carry = true;
		}
		
		return result;
	}
	
	// Helper function to create a new array when the given array is full of 9's
	public static int[] newArray(int n) {
		int result[] = new int[n+1];
		
		result[0] = 1;
		
		return result;
	}
}
