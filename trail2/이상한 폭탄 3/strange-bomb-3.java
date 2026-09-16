import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bombs = new int[n];
        for (int i = 0; i < n; i++)
            bombs[i] = sc.nextInt();
        // Please write your code here.

        boolean[] exploded = new boolean[n];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (j - i > k) {
                    break;
                }

                if (bombs[i] == bombs[j]) {
                    exploded[i] = true;
                    exploded[j] = true;
                }
            }
        }

        int[] count = new int[1000001];

        for (int i = 0; i < n; i++) {
            if (exploded[i]) {
                count[bombs[i]]++;
            }
        }

        // 가장 많이 폭발한 숫자 찾기
        int maxResult = 0;
        int result = 0;

        for (int i = 1; i <= 1000000; i++) {
            if (count[i] > maxResult) {
                maxResult = count[i];
                result = i;
            }
        }

        System.out.println(result);
    }
}
