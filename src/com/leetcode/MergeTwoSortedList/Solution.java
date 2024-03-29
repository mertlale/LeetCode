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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode mergedListHead = new ListNode();
        ListNode current = mergedListHead;

        while(list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = list1 != null ? list1: list2;
        return mergedListHead.next;
    }
}
