package com.fpolizzi;

/**
 * Created by fpolizzi on 8/9/26
 */
public class ReverseLinkedList {

    void main(){
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode previous = null;
        ListNode current = head;
        ListNode next = current.next;

        while (current != null) {
            current.next = previous;
            previous = current;
            current = next;

            if (next != null) {
                next = current.next;
            }
        }

        head = previous;
        return head;
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
}
