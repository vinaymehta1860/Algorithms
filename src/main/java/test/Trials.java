package test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import java.util.*;

public class Trials {

	public static void main(String[] args) {
		int cells[] = new int[8];
		
		cells[0] = 0;
		cells[1] = 1;
		cells[2] = 1;
		cells[3] = 0;
		cells[4] = 1;
		cells[5] = 1;
		cells[6] = 1;
		cells[7] = 1;
		
		int New[] = new int[cells.length];
		New = cells;
		
		for(int i=0; i<New.length; i++ ) {
			System.out.print(New[i] + " ");
		}
	}
}
