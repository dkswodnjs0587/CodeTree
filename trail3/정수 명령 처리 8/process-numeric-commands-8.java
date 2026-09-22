import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            // Please write your code here.
            if (command.equals("push_back")) {
                int x = sc.nextInt();
                list.addLast(x);
            }
            if (command.equals("push_front")) {
                int x = sc.nextInt();
                list.addFirst(x);
            }
            if (command.equals("pop_front")) {
                System.out.println(list.pollFirst());
            }
            if (command.equals("pop_back")) {
                System.out.println(list.pollLast());
            }
            if (command.equals("size")) {
                System.out.println(list.size());
            }
            if (command.equals("empty")) {
                // 비어있으면 1, 아니면 0
                System.out.println(list.isEmpty() ? 1 : 0);
            }
            if (command.equals("front")) {
                System.out.println(list.getFirst());
            }
            if (command.equals("back")) {
                System.out.println(list.getLast());
            }
        }
    }
}
