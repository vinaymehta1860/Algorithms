package Leetcode;

public class StringCompression {
    public static void main(String[] args) {
        String s = "abcde";

        System.out.println(stringCompression(s));
    }

    public static String stringCompression(String s) {
        // Basic checks
        if (s == null) {
            throw new Error("Invalid input. Error description: Input is null.");
        }
        if (s.length() == 1) {
            return s;
        }

        String compressedString = "";
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                count++;
            } else {
                compressedString += Character.toString(s.charAt(i-1)) + Integer.toString(count);
                count = 1;
            }
        }

        compressedString += Character.toString(s.charAt(s.length() - 1));
        compressedString += Integer.toString(count);

        if (compressedString.length() <= s.length()) {
            return compressedString;
        } else {
            return s;
        }
    }
}
