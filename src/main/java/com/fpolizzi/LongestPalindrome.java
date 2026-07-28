package com.fpolizzi;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fpolizzi on 7/28/26
 */
public class LongestPalindrome {

    static void main() {

        String s = "abccccdd";

        System.out.println((longestPalindrome(s)));
    }

    public static int longestPalindrome(String s) {

        Map<Character, Integer> countCharacters = new HashMap<>();
        int result = 0;

        for (char character : s.toCharArray()) {
            countCharacters.put(character, countCharacters.getOrDefault(character, 0) + 1);
            if (countCharacters.get(character) % 2 == 0) {
                result += 2;
            }
        }

        return result + (result < s.length() ? 1 : 0);
    }
}
