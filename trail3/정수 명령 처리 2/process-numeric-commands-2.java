import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i < n; i++) {
            String str = sc.next();

            if(str.equals("push")) {
                int A = sc.nextInt();

                queue.add(A);
            }
            else if(str.equals("pop")) {
                System.out.println(queue.poll());
            }
            else if(str.equals("size")) {
                System.out.println(queue.size());
            }
            else if(str.equals("empty")) {
                System.out.println(queue.isEmpty() ? 1 : 0);
            }
            else {
                System.out.println(queue.peek());
            }
        }
    }
}