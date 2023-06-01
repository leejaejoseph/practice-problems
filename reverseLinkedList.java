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
        ListNode curr = head;
        ListNode move = head.next;
        while(curr.next != null) {
           ListNode temp = head;
           head = curr.next;
           curr.next = curr.next.next;
           head.next = temp;

        }
        return head;
    }
}
