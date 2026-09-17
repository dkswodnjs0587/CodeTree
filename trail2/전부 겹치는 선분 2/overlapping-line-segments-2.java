import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();

        }
        // Please write your code here.
        boolean isPossible = false;

        for (int i = 0; i < n; i++) {
            int[] arr = new int[101];
            int start = 101;
            int end = -1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                start = Math.min(start, x1[j]);
                end = Math.max(end, x2[j]);
                for (int k = x1[j]; k <= x2[j]; k++) {
                    arr[k]++;
                }
            }

            boolean temp = false;

            for (int j = start; j <= end; j++) {
                if(arr[j] == n - 1) {
                    temp = true;
                    break;
                }
            }

            if(temp) {
                isPossible = true;
                break;
            }
        }
        if(isPossible) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}
