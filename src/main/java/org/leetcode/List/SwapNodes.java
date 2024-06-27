package org.leetcode.List;

public class SwapNodes {
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode pre = dummy;

            while (head != null && head.next != null){
                ListNode first = head;
                ListNode second = head.next;
                pre.next = second;
                first.next = second.next;
                second.next = first;
                pre = first;
                head = first.next;
            }
            return dummy.next;
        }
        public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    }
}
