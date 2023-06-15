class MyCircularQueue {
    int k;
    int h;
    int t;
    int size;
    int[] myCircularQueue;

    public MyCircularQueue(int k) {
        //ArrayList<Integer> myCircularQueue = new ArrayList(k);
        this.k = k;
        this.h = 0;
        this.t = 0;
        this.size = 0;
        this.myCircularQueue = new int[k];
    }

    public boolean enQueue(int value) {
        if (size == k) return false;
        myCircularQueue[t] = value;
        t = (t + 1) % k;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (size == 0) return false;
        h = (h + 1) % k;
        size--;
        return true;
    }

    public int Front() {
        if (size == 0) return -1;
        return myCircularQueue[h];
    }

    public int Rear() {
        if (size == 0) return -1;
        return myCircularQueue[(t - 1 + k) % k];
    }

    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    public boolean isFull() {
        return size == k;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
