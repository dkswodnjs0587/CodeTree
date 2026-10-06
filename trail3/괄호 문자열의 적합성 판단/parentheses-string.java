import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // Please write your code here.
        Stack<Character> s = new Stack<>();
        boolean isOkay = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                s.push('(');
            }
            else {
                if (s.isEmpty()) {
                    isOkay = false;
                    break;
                }
                else {
                    s.pop();
                }
            }
        }

        if (s.isEmpty() && isOkay) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}
