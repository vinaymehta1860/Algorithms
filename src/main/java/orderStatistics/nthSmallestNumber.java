package orderStatistics;

import java.util.TreeSet;

public class nthSmallestNumber {

	public static void main(String[] args) {
		int arr[] = new int[7];
		
		arr[0] = 10;
		arr[1] = 17;
		arr[2] = 2;
		arr[3] = 21;
		arr[4] = 12;
		arr[5] = 19;
		arr[6] = 13;
		
		int answer = nthSmallest(arr, 5);
		System.out.println("5th smallest number: " + answer);
	}
	
	public static int nthSmallest(int[] arr, int n) {
		TreeSet<Integer> ts = new TreeSet<Integer>();

		for(int i=0; i<arr.length; i++) {
			ts.add(arr[i]);
		}
		
		System.out.println("Sorted array --> " + ts);
		
		if(n == arr.length) {
			return ts.last();
		}
		else {
			int answer = -1, index = 1;
			
			for(int i : ts) {
				if(index == n) {
					answer = i;
					break;
				}
				
				index++;
			}
			
			return answer;
		}
	}
}
