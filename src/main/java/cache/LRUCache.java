package cache;

import java.util.Hashtable;
import java.util.ArrayList;

public class LRUCache {

	// This hashtable is the main cache
	public static Hashtable<Integer, Integer> ht;
	// This list is to keep track of order of requests made
	public static ArrayList<Integer> order;
	public static int capacity;
	
	public LRUCache(int cap) {
		ht = new Hashtable<Integer, Integer>(cap);
		order = new ArrayList<Integer>(cap);
		capacity = cap;
	}
	
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		
		cache.put(1, 1);
		System.out.println("Cache after Put 1, 1: " + ht);
		System.out.println("List after Put 1, 1: " + order);
		
		cache.put(2, 2);
		System.out.println("Cache after Put 2, 2: " + ht);
		System.out.println("List after Put 1, 1: " + order);
		
		cache.get(1);
		System.out.println("Cache after Get 1: " + ht);
		System.out.println("List after Get 1: " + order);
		
		cache.put(3, 3);
		System.out.println("Cache after Put 3, 3: " + ht);
		System.out.println("List after Put 3, 3: " + order);
		
		cache.get(2);
		System.out.println("Cache after Get 2: " + ht);
		System.out.println("List after Get 2: " + order);
		
		cache.put(4, 4);
		System.out.println("Cache after Put 4, 4: " + ht);
		System.out.println("List after Put 4, 4: " + order);
		
		cache.get(1);
		System.out.println("Cache after Get 1: " + ht);
		System.out.println("List after Get 1: " + order);
		
		cache.get(3);
		System.out.println("Cache after Get 3: " + ht);
		System.out.println("List after Get 3: " + order);
		
		cache.get(4);
		System.out.println("Cache after Get 4: " + ht);
		System.out.println("List after Get 4: " + order);
		
		System.out.println("Final Cache: " + ht);
	}
	
	public int get(int key) {
		//Check if our cache contains the key
		if(ht.containsKey(key)) {
			// Check if the order already contains the key.
			// 	If yes, remove it and add it again to the front.
			if(order.contains(key)) {
				order.remove(order.indexOf(key));
				order.add(key);
			}
			return ht.get(key);
		}
		return -1;
	}
	
	public void put(int key, int value) {
		// First check if the key is already in our cache or not.
		// 	If yes, then update the value and add it to our ordered list
		if(ht.containsKey(key)) {
			// Check if the order already contains the key.
			// 	If yes, remove it and add it again to the front.
			if(order.contains(key)) {
				order.remove(order.indexOf(key));
				order.add(key);
			}
			ht.put(key, value);
			return;
		}
		
		// Check if the cache is at its capacity or not.
		// 	If not, then directly add the <key, value> pair and also add key to the ordered list
		if(ht.size() < capacity) {
			order.add(key);
			ht.put(key, value);
			return;
		}
		else {
			// Get the first element from list and remove it from cache
			int keyToRemove = order.remove(0);
			order.add(key);
			ht.remove(keyToRemove);
			ht.put(key, value);
			return;
		}
	}
}
