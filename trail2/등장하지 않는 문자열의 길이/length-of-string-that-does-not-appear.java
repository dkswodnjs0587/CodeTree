import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        // Please write your code here.
        for (int len = 1; len <= n; len++) {
            Set<String> set = new HashSet<>();
            boolean duplicate = false;

            for (int i = 0; i <= n - len; i++) {
                String sub = str.substring(i, i + len);

                if (set.contains(sub)) {
                    duplicate = true;
                    break;
                }

                set.add(sub);
            }

            if (!duplicate) {
                System.out.println(len);
                break;
            }
        }

    }
}
