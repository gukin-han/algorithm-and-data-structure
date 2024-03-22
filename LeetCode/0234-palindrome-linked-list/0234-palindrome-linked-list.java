/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            size++;
        }
        
        if (size == 1) return true;

        int mid = (size % 2 == 0 ? size / 2 + 1: size / 2 + 2);
        ListNode head2 = head;
        for (int i = 0; i < mid - 1; i++) {
            head2 = head2.next;
        }
        cur = head2.next;
        ListNode prev = null;
        while (cur != null) {
            prev = cur;
            cur = cur.next;
            prev.next = head2;
            head2 = prev;
        }

        for (int i = 0; i < size/2; i++) {
            System.out.println(head.val + " " + head2.val);
            if (head.val != head2.val) return false;
            head = head.next;
            head2 = head2.next;
        }

        return true;
    }
}