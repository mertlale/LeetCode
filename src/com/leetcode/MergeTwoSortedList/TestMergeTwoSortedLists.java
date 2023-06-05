package com.leetcode.MergeTwoSortedList;

public class TestMergeTwoSortedLists {
    public static void main(String[] args) {
        // Test Case 1
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode merged1 = solution.mergeTwoLists(l1, l2);
        printList(merged1); // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4

        // Test Case 2
        ListNode l3 = null;
        ListNode l4 = null;

        ListNode merged2 = solution.mergeTwoLists(l3, l4);
        printList(merged2); // Output: (empty list)

        // Test Case 3
        ListNode l5 = null;
        ListNode l6 = new ListNode(0);

        ListNode merged3 = solution.mergeTwoLists(l5, l6);
        printList(merged3); // Output: 0
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}