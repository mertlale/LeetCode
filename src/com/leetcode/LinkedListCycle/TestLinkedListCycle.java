package com.leetcode.LinkedListCycle;

public class TestLinkedListCycle {
    public static void main(String[] args) {
        // Test Case 1
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(0);
        head1.next.next.next = new ListNode(-4);
        // Create a cycle: -4 -> 2
        head1.next.next.next.next = head1.next;
        Solution solution = new Solution();
        boolean hasCycle1 = solution.hasCycle(head1);
        System.out.println("Linked List Has Cycle? " + hasCycle1); // Output: true

        // Test Case 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        boolean hasCycle2 = solution.hasCycle(head2);
        System.out.println("Linked List Has Cycle? " + hasCycle2); // Output: false
    }
}
