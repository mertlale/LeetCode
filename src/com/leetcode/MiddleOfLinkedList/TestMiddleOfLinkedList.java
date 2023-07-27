package com.leetcode.MiddleOfLinkedList;

public class TestMiddleOfLinkedList {
    // Helper method to create a linked list from an array of values.
    private static ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] values1 = {1, 2, 3, 4, 5};
        ListNode head1 = createLinkedList(values1);
        ListNode middle1 = solution.middleNode(head1);
        System.out.println("Middle Node: " + middle1.val); // Output: 3

        int[] values2 = {1, 2, 3, 4, 5, 6};
        ListNode head2 = createLinkedList(values2);
        ListNode middle2 = solution.middleNode(head2);
        System.out.println("Middle Node: " + middle2.val); // Output: 4
    }
}
