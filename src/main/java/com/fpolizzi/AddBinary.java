package com.fpolizzi;

/**
 * Created by fpolizzi on 8/14/26
 */
public class AddBinary {

    void main() {

        System.out.println(addBinary("1010", "1011"));
    }

    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();

        // length of both strings
        int i = a.length() - 1;
        int j = b.length() - 1;

        // helper variable to carry the rest portion
        // if a division has one
        int carry = 0;

        while (i >= 0 || j >= 0) {

            int sum = carry;

            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';

            sb.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
