package com.leetcode.AddBinary;

public class Solution {
    public String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();
        int i = a.length() - 1; // Pointer for string a starts from the last element
        int j = b.length() - 1; // Same for string b
        int carry = 0;

        while (i >= 0 || j >= 0) { // Loop until both of the strings' binary digits are ended.
            int sum = carry; // always add carry when skip to the next digit

            /* chars can do math operations like integers with their ASCII numbers. To get the exact int number from
            ASCII number, zero's ASCII number(48) can be subtracted from our number's. (Ex: '5' - '0' = 53 - 48 = 5)
            */
            if (i >= 0) sum += a.charAt(i--) - '0'; // decrease i after the math operation is done.
            if (j >= 0) sum += b.charAt(j--) - '0';

            carry = sum / 2; // Carry will be the integer division of sum / 2

            result.append(sum % 2);
        }

        if (carry != 0) result.append(carry);
        return result.reverse().toString();
    }
}
