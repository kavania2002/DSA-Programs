import java.util.*;

class MyStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        for (int i = 0; i < 4; ++i) {
            if (!s.isEmpty()) {
                System.out.println(s.top());
            }
            System.out.println(s.pop());
        }
    }

    static class Stack {

        private List<Integer> data;

        public Stack() {
            data = new ArrayList<>();
        }

        public void push(int x) {
            data.add(x);
        }

        public boolean isEmpty() {
            return data.isEmpty();
        }

        public int top() {
            return data.get(data.size() - 1);
        }

        public boolean pop() {
            if (isEmpty()) {
                return false;
            }
            data.remove(data.size() - 1);
            return true;
        }
    }
};
