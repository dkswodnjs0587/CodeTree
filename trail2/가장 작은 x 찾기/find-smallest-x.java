import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        // Please write your code here.

        for (int i = 1; i < 10001; i++) {
            boolean isPossible = true;

            for (int j = 0; j < n; j++) {
                int x = i;

                x *= 2 << j;

                if (x < a[j] || x > b[j]) {
                    isPossible = false;
                    break;
                }
            }

            if (isPossible) {
                System.out.print(i);
                break;
            }
        }
    }
}
