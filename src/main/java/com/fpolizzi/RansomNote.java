package com.fpolizzi;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fpolizzi on 8/6/26
 */
public class RansomNote {

    void main() {

        String ransomNote = "aa";
        String magazine = "aab";

        System.out.println(canConstruct(ransomNote, magazine));
    }

    public boolean canConstruct(String ransomNote, String magazine) {

        // Edge case: if the note is longer than the magazine, it's impossible
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        Map<Character, Integer> charMap = new HashMap<>();

        // Count frequencies in magazine
        for (char c : magazine.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        // Check frequencies against ransomNote
        for (char c : ransomNote.toCharArray()) {
            int count = charMap.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            charMap.put(c, count - 1);
        }

        return true;
    }
}
