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
    public ListNode middleNode(ListNode head) {
        ListNode copy = head;
        int count = 1;
        while (copy.next != null) {
          count++;
          copy = copy.next;
        }
        count /= 2;
        while (count != 0) {
          count--;
          head = head.next;
        }
        return head;
    }
}
