package com.fpolizzi;

/**
 * Created by fpolizzi on 8/7/26
 */
public class MergeTwoSortedLinkedLists {

    void main() {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // create a start node
        ListNode returnNode = new ListNode(Integer.MIN_VALUE);

        // get a copy of the start node to iterate
        ListNode headNode = returnNode;

        // go on until one of the lists reaches the end
        while (list1 != null && list2 != null) {

            // compare the two values of the lists
            if (list1.val <= list2.val) {
                returnNode.next = list1;
                list1 = list1.next;
            } else {
                returnNode.next = list2;
                list2 = list2.next;
            }

            returnNode = returnNode.next;
        }

        // append the remaining list
        if (list1 == null) {
            returnNode.next = list2;
        } else if (list2 == null) {
            returnNode.next = list1;
        }

        // return the next node to the start node
        return headNode.next;
    }

    /**
     * Definition for a singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}