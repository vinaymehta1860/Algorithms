package cache;

import java.util.Hashtable;

public class LRUCache {
	
	public static Hashtable<Hashtable<Integer, Integer>, Integer> ht1;
	public static int cap;
	
	public LRUCache(int capacity) {
		ht1 = new Hashtable<Hashtable<Integer, Integer>, Integer>(capacity);
		cap = capacity;
	}

	public static void main(String[] args) {
		
		LRUCache t = new LRUCache(2);
		
		t.put(1, 1);
		System.out.println("After Put 1 1: " + ht1);
		
		t.put(2, 2);
		System.out.println("After Put 2 2: " + ht1);
		
		t.get(1);
		System.out.println("After Get 1: " + ht1);
		
		t.put(3, 3);
		System.out.println("After Put 3 3: " + ht1);
		
		t.get(2);
		System.out.println("After Get 2: " + ht1);
		
		t.put(4, 4);
		System.out.println("After Put 4 4: " + ht1);
		
		t.get(1);
		System.out.println("After Get 1: " + ht1);
		
		t.get(3);
		System.out.println("After Get 3: " + ht1);
		
		t.get(4);
		System.out.println("After Get 4: " + ht1);
		
		System.out.println("Final cache with frequency number: " + ht1);
	}
	
	public int get(int key) {
		for(Hashtable<Integer, Integer> ht0 : ht1.keySet()) {
			if(ht0.containsKey(key)) {
				ht1.put(ht0, (ht1.get(ht0)+1));
				return ht0.get(key);
			}
		}
		return -1;
	}
	
	public void put(int key, int value) {
		// This for loop will check if the key is already present in cache or not.
		//  If yes, it'll update the value and assign the frequency of 0 to it.
		for(Hashtable<Integer, Integer> ht0 : ht1.keySet()) {
			if(ht0.containsKey(key)) {
				Hashtable<Integer, Integer> ht9 = new Hashtable<Integer, Integer>();
				ht9.put(key, value);
				ht1.put(ht9, 0);
				return;
			}
		}
		
		// Check if the cache is at it's capacity or not. If not, just enter the <key, value> pair.
		//  If the cache is at it's capacity, then do the rest of the work which is in else block.
		if(ht1.size() < cap) {
			Hashtable<Integer, Integer> ht9 = new Hashtable<Integer, Integer>();
			ht9.put(key, value);
			ht1.put(ht9, 0);
			return;
		}
		else {
			// Loop through the cache and find out which entry is the least used
			int min = Integer.MAX_VALUE;
			Hashtable<Integer, Integer> minHash = null;
			for(Hashtable<Integer, Integer> ht0 : ht1.keySet()) {
				if(ht1.get(ht0) < min) {
					min = ht1.get(ht0);
					// Capture the key which will be a hashtable so that you can replace it
					minHash = new Hashtable<Integer, Integer>(ht0);
				}
			}
			// Remove the least used entry from the main hashtable
			ht1.remove(minHash);
			
			// Now you can go ahead and enter the new <key, value> pair with 0 frequency into the cache
			Hashtable<Integer, Integer> newHash = new Hashtable<Integer, Integer>();
			newHash.put(key, value);
			ht1.put(newHash, 0);
			return;
		}
	}
}
