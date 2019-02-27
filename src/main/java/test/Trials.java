package test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import java.util.*;

public class Trials {

	public static void main(String[] args) {
		
		int arr[] = new int[4];
		
		arr[0] = 0;
		arr[1] = 0;
		arr[2] = 0;
		arr[3] = 0;
		
		arr = incrementedArray(arr);
		
		for(int i= 0; i< arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public static int[] incrementedArray(int[] array) {
		int copy[] = new int[array.length];
		boolean carry = false;
		
		copy = Arrays.copyOf(array, array.length);
		
		for(int i = (array.length-1); i >= 0; i--) {
			if(carry == true) {
				if(copy[i] == 9) {
					if(i==0) {
						copy = newArray(array.length);
						break;
					}
					copy[i] = 0;
					carry = true;
					continue;
				}
				else {
					copy[i] += 1;
					break;
				}
			}
			
			if(copy[i] != 9) {
				copy[i] += 1;
				break;
			}
			
			copy[i] = 0;
			carry = true;
		}
		
		return copy;
	}
	
	public static int[] newArray(int n) {
		int result[] = new int[n+1];
		
		result[0] = 1;
		
		return result;
	}
}
