import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String str = sc.next();

            if (str.equals("push_front")) {
                int num = sc.nextInt();
                deque.addFirst(num);
            }
            else if (str.equals("push_back")) {
                int num = sc.nextInt();
                deque.addLast(num);
            }
            else if (str.equals("pop_front")) {
                System.out.println(deque.pollFirst());
            }
            else if (str.equals("pop_back")) {
                System.out.println(deque.pollLast());
            }
            else if (str.equals("size")) {
                System.out.println(deque.size());
            }
            else if (str.equals("empty")) {
                System.out.println(deque.isEmpty() ? 1 : 0);
            }
            else if (str.equals("front")) {
                System.out.println(deque.peekFirst());
            }
            else {
                System.out.println(deque.peekLast());
            }
        }
    }
}
