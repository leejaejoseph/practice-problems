/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;
        Stack<Node> stored = new Stack<Node>();
        Node flattened = head;
        Node next;
        while(flattened != null) {
            if (flattened.child != null) {
                if (flattened.next != null) {
                    flattened.next.prev = flattened;
                    stored.add(flattened.next);
                }
                flattened.next = flattened.child;
                flattened.next.prev = flattened;
                flattened.child = null;
                flattened.next.prev = flattened;
            } else if (flattened.next == null) {
                if (!stored.isEmpty()) {
                    next = stored.pop();
                    flattened.next = next;
                    next.prev = flattened;
                }
            }
            flattened = flattened.next;
        }
        return head;
    }
}
