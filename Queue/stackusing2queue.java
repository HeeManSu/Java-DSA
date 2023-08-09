import java.util.*;

public class stackusing2queue {
    public static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty();
        }

        // add
        public void add(int data) {
            if (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            q1.add(data);

            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

        // remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }

            while (q1.size() > 1) {
                q2.add(q1.remove());
            }

            int popped = q1.remove();

            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return popped;
        }

        // peek

        public int peek() {
            if (isEmpty()) {
                return -1; // Stack is empty
            }

            while (q1.size() > 1) {
                q2.add(q1.remove());
            }

            int topElement = q1.peek();

            q2.add(q1.remove()); // Move the last element to q2

            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return topElement;
        }

    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.add(1);
        stack.add(2);
        stack.add(3);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.remove());
        System.out.println("Popped element: " + stack.remove());

        System.out.println("Top element: " + stack.peek());

        stack.add(4);

        System.out.println("Top element: " + stack.peek());
    }
}
