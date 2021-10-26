import java.util.*;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class LLQueue {
    int size = 0;
    ListNode head, tail;

    public LLQueue() {
        head = null;
        tail = null;
    }

    public boolean enQueue(int val) {
        ListNode newNode = new ListNode(val);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head = head.next;
        size--;
        return true;
    }

    public int Front() {
        return isEmpty() ? -1 : head.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class MyLLQueue {
    public static void main(String[] args) {
        LLQueue q = new LLQueue();
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
