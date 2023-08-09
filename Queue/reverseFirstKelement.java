import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseFirstKelement {

    public static void reversek(Queue<Integer> q1, int k) {
        Stack<Integer> s1 = new Stack<>();
        for (int i = 1; i <= k; i++) {
            s1.push(q1.remove());
        }

        //add the element from the stack to the back of the queue
        for (int i = 1; i <= k; i++) {
            q1.add(s1.pop());
        }

        //revser the queue
        for (int i = 1; i <= q1.size() - k; i++) {
            q1.add(q1.remove());
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(5);
        q1.add(6);
        q1.add(9);
        q1.add(4);
        q1.add(3);
        q1.add(0);
        q1.add(11);
        q1.add(15);
        reversek(q1, 4);
        while (!q1.isEmpty()) {
            System.out.print(q1.poll() + " ");
        }
    }
}
