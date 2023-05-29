/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        if (A == B) {
            return A;
        }
        int LengthA = 0;
        int LengthB = 0;
        while (A.next != null) {
            A = A.next;
            LengthA++;
        }
        while (B.next != null) {
            B = B.next;
            LengthB++;
        }
        A = headA;
        B = headB;
        int skipA = 0;
        int skipB = 0;
        int difference = Math.abs(LengthA - LengthB);
        if (LengthA > LengthB) {
            LengthA += difference;
            while (difference > 0) {
                A = A.next;
                difference--;
            }
        } else if (LengthB > LengthA) {
            LengthB += difference;
            while (difference > 0) {
                B = B.next;
                difference--;
            }
        }
        if (A == B) {
            return A;
        }
        while (A.next != null) {
            if (A == B) {
                return A;
            } else if (A.next == B.next) {
                return A.next;
            }
            A = A.next;
            B = B.next;
        }

        return B.next;
    }
}
