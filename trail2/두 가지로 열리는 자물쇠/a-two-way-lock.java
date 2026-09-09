import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        // Please write your code here.
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (checkDist(i, a, n) && checkDist(j, b, n) && checkDist(k, c, n)) {
                        count++;
                        continue;
                    }
                    if (checkDist(i, a2, n) && checkDist(j, b2, n) && checkDist(k, c2, n)) {
                        count++;
                        continue;
                    }
                }
            }
        }

        System.out.print(count);
    }

    public static boolean checkDist(int a, int b, int n) {
        int diff = Math.abs(a - b);
        int dist = Math.min(diff, n - diff);

        return dist <= 2;
    }
}
