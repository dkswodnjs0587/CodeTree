import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = sc.next();

            if (str.equals("push_back")) {
                int a = sc.nextInt();

                arr.add(a);
            }

            if (str.equals("pop_back")) {
                arr.remove(arr.size() - 1);
            }

            if (str.equals("size")) {
                System.out.println(arr.size());
            }

            if (str.equals("get")) {
                int a = sc.nextInt();

                System.out.println(arr.get(a - 1));
            }

        }
    }
}
