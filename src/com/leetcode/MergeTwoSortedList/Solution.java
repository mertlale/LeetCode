package com.leetcode.MergeTwoSortedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode mergedListHead = new ListNode();
        ListNode current = mergedListHead;
        System.out.println("\nNew Test");

        while(l1 != null || l2 != null) {

            if (l1 != null && l2 != null) { // if both is not empty
                ListNode newNode = new ListNode();
                current.next = newNode;
                if (l1.val <= l2.val) { // if list1 is lower, take list1
                    newNode.val = l1.val;
                    l1 = l1.next;
                } else { // if list2 is lower, take list2
                    newNode.val = l2.val;
                    l2 = l2.next;
                }
                current = current.next;
            } else if (l1 != null) { // if list2 is empty
                current.next = l1;
                break;
            }
            else { // if list1 is empty
                current.next = l2;
                break;
            }
        }

        return mergedListHead.next;
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
