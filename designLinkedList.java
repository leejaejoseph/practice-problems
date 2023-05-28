class MyLinkedList {
    class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index >= size) {
            return -1;
        }

        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        Node headItem = new Node(val);
        if (head == null) {
            firstNode(headItem);
            return;
        }
        headItem.next = head;
        head = headItem;
        size++;
    }

    public void addAtTail(int val) {
        Node tailItem = new Node(val);
        if (head == null) {
            firstNode(tailItem);
            return;
        }
        tail.next = tailItem;
        tail = tailItem;
        size++;
    }

    public void addAtIndex(int index, int val) {
        Node newItem = new Node(val);
        if (index == size) {
            addAtTail(val);
            return;
        } else if (index > size){
            return;
        } else if (index == 0) {
            addAtHead(val);
            return;
        }

        if (head == null) {
            firstNode(newItem);
            return;
        }

        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        newItem.next = curr.next;
        curr.next = newItem;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }

        Node curr = head;
        if (index == 0) {
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                head = curr.next;
            }
            size--;
            return;
        }

        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        if (curr.next != null && curr.next.next != null) {
            curr.next = curr.next.next;
        } else {
            curr.next = null;
            tail = curr;
        }
        size--;
    }
    public void firstNode(Node firstNode) {
        head = firstNode;
        tail = firstNode;
        size++;
    }
}
