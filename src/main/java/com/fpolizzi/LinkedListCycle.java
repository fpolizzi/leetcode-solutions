package com.fpolizzi;

/**
 * Created by fpolizzi on 8/8/26
 */
public class LinkedListCycle {

    void main(){
    }

    public boolean hasCycle(ListNode head) {
        ListNode currentNode = head;
        ListNode pointer = head;

        while (currentNode != null && currentNode.next != null) {

            pointer = pointer.next;
            currentNode = currentNode.next.next;

            if (currentNode == pointer) {
                return true;
            }
        }

        return false;
    }

    /**
     * Definition for a singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
