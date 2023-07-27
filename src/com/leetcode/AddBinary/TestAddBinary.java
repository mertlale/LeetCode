package com.leetcode.AddBinary;

public class TestAddBinary {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String a1 = "11";
        String b1 = "1";
        System.out.println("Binary Sum: " + solution.addBinary(a1, b1)); // Output: "100"

        String a2 = "1010";
        String b2 = "1011";
        System.out.println("Binary Sum: " + solution.addBinary(a2, b2)); // Output: "10101"
    }
}

