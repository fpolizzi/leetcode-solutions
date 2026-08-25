package com.fpolizzi;

import java.util.Arrays;
import java.util.List;

/**
 * Created by fpolizzi on 8/25/26
 */
public class FindAllAnagramsInAString {

    public List<Integer> findAnagrams(String s, String p) {

        int[] pCount = new int[26];
        int[] sCount = new int[26];
        List<Integer> result = new java.util.ArrayList<>();

        // count frequency of characters in p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        // sliding window that counts frequency of characters in s
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;

            // remove the character out of the window
            if (i >= p.length()) {
                sCount[s.charAt(i - p.length()) - 'a']--;
            }

            // compare count arrays
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }
}
