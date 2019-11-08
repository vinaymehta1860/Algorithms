/*
    Sort a lowercase string lexographically.
 */
package Leetcode;

import java.util.ArrayList;

public class LexographicalSort {
    public static void main(String[] args) {
        String a1 = "vinay";
        char a[] = a1.toCharArray();

        for(int i = 0; i < (a.length - 1); i++) {
            for(int j = (i+1); j < (a.length); j++) {
                String temp = "";
                if(Character.toString(a[i]).compareTo(Character.toString(a[j])) > 0) {
                    temp = Character.toString(a[i]);
                    a[i] = a[j];
                    a[j] = temp.charAt(0);
                }
            }
        }

        System.out.println(new String(a));
    }

    public static void arraySort() {
        String[] arr = new String[5];

        arr[0] = "Vinay";
        arr[1] = "Vishal";
        arr[2] = "Vimal";
        arr[3] = "Nita";
        arr[4] = "Mehta";

        for(int i = 0; i < (arr.length - 1); i++) {
            for(int j = (i+1); j < arr.length; j++) {
                String temp = "";
                if(arr[i].compareTo(arr[j]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(String s : arr)
            System.out.println(s);
    }

    public static void listSort() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hdemkfr");
        list.add("qggx");
        list.add("zskaqzwo");
        list.add("pwqvwmlgri");
        list.add("fqizrrnmif");
        list.add("glarko");

        for(int i = 0; i < (list.size() - 1); i++) {
            for(int j = (i+1); j < list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) > 0) {
                    String temp = list.get(i);

                    list.remove(i);
                    list.add(i, list.get(j-1));
                    list.remove(j);
                    list.add(j, temp);
                }
            }
        }

        System.out.println(list);
    }
}
