package com.fpolizzi;

/**
 * Created by fpolizzi on 7/27/26
 */
public class ValidAnagram {

    static void main() {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(validAnagram(s, t));
    }

    public static boolean validAnagram(String s, String t) {

        s = s.toLowerCase();
        t = t.toLowerCase();

        s = s.replace(" ", "");
        t = t.replace(" ", "");

        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            counts[t.charAt(i) - 'a']--;
        }

        for(int count : counts) {
            if (count != 0)
                return false;
        }

        return true;
    }
}
