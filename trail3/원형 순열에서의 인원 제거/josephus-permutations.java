import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        // Please write your code here.
        Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> result = new ArrayDeque<>();

        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while(!queue.isEmpty()) {
            for(int i = 0; i < k - 1; i++) {
                queue.add(queue.peek());
                queue.poll();
            }

            result.add(queue.peek());

            queue.poll();
        }

        for(int i = 0; i < n; i++) {
            System.out.print(result.poll() + " ");
        }
    }
}