package com.leetcode.ValidPalindrome;

// Solution1 is more optimized than SoLution2
public class Solution2 {
    public boolean isPalindrome(String s) {

        // First convert lower case then remove all non-alphanumeric characters by regex
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        if (s.length() == 0) {return true;}
//        System.out.println(s);

        int j = s.length() - 1;

        char[] s_array = s.toCharArray();

        for (int i = 0; i <= s.length()/2; i++) {
//            System.out.println(s_array[i] + " " + s_array[j]);
            if (s_array[i] != s_array[j]) {
                return false;
            }
            j--;
        }

        return true;
    }
}
