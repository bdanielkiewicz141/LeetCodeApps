package com.company;

public class Solution {

    private boolean isResultChanged = false;


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null;
        return returnBiggerValueNode(list1, list2);
    }

    private ListNode returnBiggerValueNode(ListNode list1, ListNode list2) {
        int minVal = -101;
        if (list1 == null || list2 == null) {
            if (list1 == null) {
                return list2;
            }
            if ((list2 == null)) {
                return list1;
            } else return null;
        }
        if (list1.val <= list2.val) {
            minVal = list1.val;
            try{
                list1=list1.next;
            } catch (Exception e) {
                list1=null;
                e.printStackTrace();
            }

        } else {
            minVal = list2.val;
            try{
                list2=list2.next;
            } catch (Exception e) {
                list2=null;
                e.printStackTrace();
            }
        }

        ListNode a = new ListNode(minVal, returnBiggerValueNode(list1, list2));
        return a;
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
