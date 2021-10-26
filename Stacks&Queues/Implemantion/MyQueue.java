import java.util.*;

class Queue {
    private List<Integer> data;
    private int p_start;

    public Queue() {
        data = new ArrayList<Integer>();
        p_start = 0;
    }

    public boolean enQueue(int x) {
        data.add(x);
        return true;
    };

    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        p_start++;
        return true;
    }

    public int Front() {
        return data.get(p_start);
    }
    
    public boolean isEmpty() {
        return p_start >= data.size();
    }
};

public class MyQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(3);
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
    }
}