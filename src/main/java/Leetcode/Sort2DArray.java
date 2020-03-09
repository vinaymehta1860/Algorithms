/*
    This class sorts a 2D array based on the value of a particular column.
    NOTE: Columns are not 0 based index.
 */
package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2DArray {
    public static void main(String[] args) {
        int[][] intervals = new int[4][2];

        intervals[0][0] = 7;
        intervals[0][1] = 10;
        intervals[1][0] = 2;
        intervals[1][1] = 4;
        intervals[2][0] = 13;
        intervals[2][1] = 15;
        intervals[3][0] = 5;
        intervals[3][1] = 7;

        // Function to sort an array based on the values of a particular column
         sortArray(intervals, 1);

        for(int i = 0; i < intervals.length; i++) {
            System.out.print(intervals[i][0] + " " + intervals[i][1]);
            System.out.println();
        }
    }

    public static void sortArray(int[][] arr, int column) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] entry1, int[] entry2) {
                if (entry1[column-1] > entry2[column-1]) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }
}
