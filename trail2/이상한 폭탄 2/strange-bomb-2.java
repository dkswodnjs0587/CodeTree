import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bombs = new int[n];
        for (int i = 0; i < n; i++) {
            bombs[i] = sc.nextInt();
        }
        // Please write your code here.
        int result = -1;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (bombs[i] != bombs[j]) {
                    continue;
                }
                if (Math.abs(j - i) > k) {
                    continue;
                }

                result = Math.max(result, bombs[j]);
            }
        }

        System.out.print(result);
    }
}
