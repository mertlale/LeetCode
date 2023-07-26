package com.leetcode.ReverseLinkedList;

public class TestReverseLinkedList {
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

    // Helper method to print a linked list.
    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] values = {1, 2, 3, 4, 5};
        ListNode head = createLinkedList(values);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        ListNode reversedHead = solution.reverseList(head);

        System.out.println("Reversed Linked List:");
        printLinkedList(reversedHead);
    }
}

