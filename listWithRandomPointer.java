/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> Nodes = new HashMap<>();
        Node duplicate = new Node(0);
        Node curr = head;
        Node copy = duplicate;

        while (curr != null) {
            copy.next = new Node(curr.val);
            copy = copy.next;
            Nodes.put(curr, copy);
            curr = curr.next;
        }
        curr = head;
        copy = duplicate.next;

        while (curr != null) {
            copy.random = Nodes.get(curr.random);
            curr = curr.next;
            copy = copy.next;
        }

        return duplicate.next;
    }
}
