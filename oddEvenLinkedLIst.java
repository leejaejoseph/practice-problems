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
    public ListNode oddEvenList(ListNode head) {
      if (head == null) return head;
      int increment = 0;
        ListNode init = head;
        ListNode evenStart = null;
        ListNode evenEnd = null;
        ListNode odd = null;
      while (init.next != null) {
        evenStart = init.next;
        evenEnd = init.next;
         if (init.next.next == null) return head;
        odd = init.next.next;
         for (int i = increment; i > 0; i--) {
            if (odd == null || odd.next == null) return head;
            odd = odd.next;
            evenEnd = evenEnd.next;
         }
         evenEnd.next = odd.next;
         odd.next = evenStart;
         init.next = odd;
         init = init.next;
         increment++;
      }
    return head;
    }
}
