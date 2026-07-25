package com.fpolizzi;

/**
 * Created by fpolizzi on 7/26/26
 */
public class ValidPalindrome {

    static void main() {

        String s = "A man, a plan, a canal: Panama";

        System.out.println((validPalindrome(s)));
    }

    public static boolean validPalindrome(String s) {

        s = s.trim().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }

            else
                return false;
        }

        return true;
    }
}
