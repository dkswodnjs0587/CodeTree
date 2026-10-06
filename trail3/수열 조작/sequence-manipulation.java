import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Queue<Integer> queue = new ArrayDeque<>();

        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while(queue.size() > 1) {
            queue.poll();

            queue.add(queue.peek());
            queue.poll();
        }

        System.out.print(queue.peek());
    }
}