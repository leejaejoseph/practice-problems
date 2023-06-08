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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr = head;

        int ind = 0;
        while (curr != null) {
            ind++;
            curr = curr.next;
        }
        ind++;
        k = k % ind;
        ListNode temp1 = head;
        curr = head;
        while (k > 0) {
            curr = curr.next;
            k--;
        }
        head = curr.next;
        ListNode temp = head;
        curr.next = null;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = temp1;
        return head;
    }
}
