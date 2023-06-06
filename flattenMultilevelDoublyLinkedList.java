class Solution {
    public Node flatten(Node head) {
        Stack<Node> stored = new Stack<Node>();
        Node flattened = head;
        Node next;
        while(true) {
            if (flattened.child != null) {
                stored.add(flattened.next);
                flattened = flattened.child;
            } else if (flattened.next != null) {
                flattened = flattened.next;
            } else if (flattened.next == null && stored.empty() == false) {
                next = stored.pop();
                next.prev = flattened;
                flattened.next = next;
            } else {
                return head;
            }
        }
    }
}
