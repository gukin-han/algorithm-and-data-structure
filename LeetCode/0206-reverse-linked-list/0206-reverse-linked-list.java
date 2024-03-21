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
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode newHead = head;
        ListNode oldHead = head.next;
        ListNode cur = head.next;
        newHead.next = null;

        while (cur != null) {
            oldHead = cur;
            cur = cur.next;
            oldHead.next = newHead;
            newHead = oldHead;
        }

        return newHead;
    }
}