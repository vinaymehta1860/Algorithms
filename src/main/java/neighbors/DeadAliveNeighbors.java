package neighbors;

import java.util.Arrays;

public class DeadAliveNeighbors {

	public static void main(String[] args) {
		int cells[] = new int[8];
		
		cells[0] = 1;
		cells[1] = 1;
		cells[2] = 1;
		cells[3] = 0;
		cells[4] = 1;
		cells[5] = 1;
		cells[6] = 1;
		cells[7] = 1;
		
		cells = deadAlive(cells, 2);
		System.out.println(Arrays.toString(cells));
		
	}
	
	public static int[] deadAlive(int[] cells, int days) {
		int nextDay[] = new int[cells.length];
		// Have a counter for the number of days
		while(days > 0) {
			for(int i=0; i<cells.length; i++) {
				// Have the check for first index of the array
				if(i == 0) {
					if(cells[i+1] == 0) {
						nextDay[i] = 0;
					}
					else {
						nextDay[i] = 1;
					}
				}
				// Have the check for last index of the array
				else if(i == (cells.length-1)) {
					if(cells[i-1] == 0) {
						nextDay[i] = 0;
					}
					else {
						nextDay[i] = 1;
					}
				}
				// Have the check for rest of the indexes
				else {
					if(cells[i-1] == cells[i+1]) {
						nextDay[i] = 0;
					}
					else {
						nextDay[i] = 1;
					}
				}
			}
			cells = Arrays.copyOf(nextDay, nextDay.length);
			days--;
		}
		return cells;
	}
}
