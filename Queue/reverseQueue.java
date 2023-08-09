import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {

    public static void reverseq1(Queue<Integer> q1) {
        Stack<Integer> s1 = new Stack<>();
        while (!q1.isEmpty()) {
            s1.add(q1.remove());
        }

        while (!s1.isEmpty()) {
            q1.add(s1.pop());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();
        q1.add(5);
        q1.add(6);
        q1.add(9);
        q1.add(1);
        reverseq1(q1);
        while (!q1.isEmpty()) {
            System.out.print(q1.poll() + " ");
        }
    }
}
