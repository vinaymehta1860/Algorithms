package Leetcode;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Combinations {

    public static void main(String[] args) {
        int a = 27;

        List<String> words = getCombinations(a);

        for (String s : words)
            System.out.print(s + " ");
    }

    public static List<String> getCombinations(int num) {
        if (num == 0 || Integer.toString(num).contains("1"))
            return new ArrayList<String>();

        String s = Integer.toString(num);
        List<String> result = new ArrayList<>();
        Hashtable<Integer, String> mapping = getMapping();

        for (int i = 0; i < s.length(); i++) {
            result = addCharToList(s.charAt(i), result, mapping);
        }

        return result;
    }

    public static List<String> addCharToList(char c, List<String> list, Hashtable<Integer, String> mapping) {
        char[] chars = mapping.get(Integer.parseInt(Character.toString(c))).toCharArray();
        List<String> result = new ArrayList<>();

        if (list.size() == 0) {
            for (char ch : chars)
                result.add(Character.toString(ch));
        } else {
            for (String s : list) {
                for (char ch : chars) {
                    result.add(s + Character.toString(ch));
                }
            }
        }

        return result;
    }

    public static Hashtable<Integer, String> getMapping() {
        Hashtable<Integer, String> mapping = new Hashtable<>();

        mapping.put(2, "abc");
        mapping.put(3, "def");
        mapping.put(4, "ghi");
        mapping.put(5, "jkl");
        mapping.put(6, "mno");
        mapping.put(7, "pqrs");
        mapping.put(8, "tuv");
        mapping.put(9, "wxyz");

        return mapping;
    }
}
