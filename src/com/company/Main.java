package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();


//        normal list
        ListNode testA = new ListNode(-5);
        ListNode a4 = new ListNode(8);
        ListNode a3 = new ListNode(6, a4);
        ListNode a2 = new ListNode(3, a3);
        ListNode a1 = new ListNode(1, a2);


        //normal list
        ListNode testB = new ListNode();

        ListNode b4 = new ListNode(7);
        ListNode b3 = new ListNode(4, b4);
        ListNode b2 = new ListNode(2, b3);
        ListNode b1 = new ListNode(0, b2);


        ListNode a = solution.mergeTwoLists(a1, testA);
        System.out.println("rozwiazanie: " + a);
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
