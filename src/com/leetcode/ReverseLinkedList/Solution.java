package com.leetcode.ReverseLinkedList;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

/* 1) Solution with Stack
Runtime = 1 ms (Beats 100%)
Memory = 41.4 MB (Beats 56.21%)
 */

public class Solution {
    public ListNode reverseList(ListNode head) {

        if (head == null) return null;

        Stack<ListNode> s = new Stack<>();
        ListNode cur = head;
        ListNode reversedList;

        while (cur.next != null) {
            s.push(cur);
            cur = cur.next;
        }

        reversedList = cur;

        while (!s.isEmpty()) {
            cur.next = new ListNode(s.pop().val);
            cur = cur.next;
        }

        return reversedList;
    }
}

/* 2) Solution with Iterating
Runtime = 0 ms (Beats 100%)
Memory = 41.57 MB (Beats 42.84%)
 */

//public class Solution {
//    public ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        ListNode curr = head;
//
//        while (curr != null) {
//            ListNode nextTemp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nextTemp;
//        }
//
//        return prev;
//    }
//}