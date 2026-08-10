package com.fpolizzi;

/**
 * Created by fpolizzi on 8/10/26
 */
public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        // traverse until the fast pointer reaches
        // the last element or null
        while (fastPointer != null && fastPointer.next != null) {

            // slowPointer moves one node
            slowPointer = slowPointer.next;

            // fastPointer moves two nodes
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;
    }

    /**
     * Definition for a singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public class ListNode {
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
}
