package Leetcode;
import java.util.HashMap;
import java.util.ArrayList;

public class Combinations {

    public static void main(String[] args) {
        HashMap<Character, String> map = new HashMap<Character, String>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        String digits = "692";

        ArrayList<String> result = new ArrayList<String>();

        for(char c : digits.toCharArray()) {
            result = getCombos(map.get(c), result);
        }

        System.out.println(result);
    }

    public static ArrayList<String> getCombos(String input, ArrayList<String> prev) {
        ArrayList<String> list = new ArrayList<String>();

        for(char c : input.toCharArray()) {
            if(prev.size() == 0) {
                list.add(Character.toString(c));
            } else {
                for(String s : prev) {
                    list.add(s + c);
                }
            }
        }

        return list;
    }

}
