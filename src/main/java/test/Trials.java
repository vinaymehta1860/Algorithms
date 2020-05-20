package test;

import javafx.util.Pair;
import java.util.*;

public class Trials {
	public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.add(10);
        queue.add(5);
        queue.add(20);

        System.out.println(queue.peek());
    }
}
