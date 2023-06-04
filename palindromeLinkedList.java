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
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = head;
        slow = reversedEnd(slow.next);
        while (slow != null && fast != null) {
            if (slow.val == fast.val) {
                slow = slow.next;
                fast = fast.next;
            } else {
                return false;
            }
        }
        return true;
    }

    private ListNode reversedEnd(ListNode slow) {
        ListNode curr = null;
        while (slow != null){
            ListNode next = slow.next;
            slow.next = curr;
            curr = slow;
            slow = next;
        }
        return curr;
    }
}
