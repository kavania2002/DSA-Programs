public class MyLLStack {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        for (int i = 0; i < 4; ++i) {
            if (!s.isEmpty()) {
                System.out.println(s.peek());
            }
            System.out.println(s.pop());
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static class Stack {
        int size = 0;
        ListNode head, tail;

        public Stack() {
            head = null;
            tail = null;
        }

        public boolean push(int val) {
            ListNode newNode = new ListNode(val);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            size++;
            return true;
        }

        public boolean pop() {
            if (isEmpty()) {
                return false;
            }
            ListNode temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
            return true;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int peek() {
            return !isEmpty() ? tail.val : null;
        }
    }

}
