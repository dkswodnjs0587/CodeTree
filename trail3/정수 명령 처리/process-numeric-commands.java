import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            String st = sc.next();
            if (st.equals("push")) {
                int a = sc.nextInt();
                s.push(a);
            }
            else if (st.equals("size")) {
                System.out.println(s.size());
            }
            else if (st.equals("empty")) {
                System.out.println(s.empty() ? 1 : 0);
            }
            else if (st.equals("pop")) {
                System.out.println(s.pop());
            }
            else if (st.equals("top")) {
                System.out.println(s.peek());
            }
        }
    }
}
