package test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import java.util.List;

public class Trials {

	public static void main(String[] args) {
		// Form the 2D array to pass it to the function
		int stones[][] = new int[6][2];
		
		stones[0][0] = 0;
		stones[0][1] = 0;
		
		stones[1][0] = 0;
		stones[1][1] = 1;
		
		stones[2][0] = 1;
		stones[2][1] = 0;
		
		stones[3][0] = 1;
		stones[3][1] = 2;
		
		stones[4][0] = 2;
		stones[4][1] = 1;
		
		stones[5][0] = 2;
		stones[5][1] = 2;
		
		int result = removeStones(stones);
		
		System.out.println("Result -> " + result);
	}
	
	public static int removeStones(int[][] stones) {
		int result = 0, x = 0, y = 0;
		ListMultimap<Integer, Integer> hs = ArrayListMultimap.create();
		
		for(int i=0; i<stones.length; i++) {
            for(int j=0; j<stones[i].length; j++) {
                if(j == 0)
                    x = stones[i][j];
                else
                    y = stones[i][j];
            }
            hs.put(x, y);
        }
		//System.out.println(hs);
		
		for(int i : hs.keySet()) {
			
		}
		
		return result;
	}
}
