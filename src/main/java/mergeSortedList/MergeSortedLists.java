package mergeSortedList;

import java.util.TreeMap;

class ListNode {
	int val;
	ListNode next;
	
	ListNode(int n){
		val = n;
		next = null;
	}
}

public class MergeSortedLists {

	public static void main(String[] args) {

	}
	
	/*public ListNode mergeKLists(ListNode[] lists) {
        TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
        ListNode result = null;
        
        for(int i=0; i<lists.length; i++) {
            tm = printLists(lists[i], tm);
        }
        
        for(int key : tm.keySet()) {
        	if (key == null) {
        		
        	}
            result = appendNode(result, key, ((int) tm.get(key)));
        }
        return result;
    }
	
	public TreeMap printLists(ListNode list, TreeMap hm) {
        // Check if the hashmap already consists of the value or not
        //  If it does, increment the counter or else create a new entry
        if(hm.containsKey(list.val)) {
            hm.put(list.val, (((int)hm.get(list.val)) + 1) );
        }
        else {
            hm.put(list.val, 1);
        }
        
        while(list.next != null) {
            return printLists(list.next, hm);
        }
        
        return hm;
    }
	
	public ListNode appendNode(ListNode ln, int key, int value) {
        for(int i=1; i<=value; i++) {
            if(ln == null) {
                ln = new ListNode(key);
            }
            else {
                ListNode temp = ln; 
                    while (temp.next != null) 
                        temp = temp.next; 
                temp.next = ln;
            }
        }
        return ln;
    }*/
}
