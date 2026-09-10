import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }
        // Please write your code here.
        int maxRes = 0;

        for (int i = 0; i < n; i++) {

            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    arr[j] = p[j] / 2 + s[j];
                } else {
                    arr[j] = p[j] + s[j];
                }
            }

            Arrays.sort(arr);

            int total = 0;
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (total + arr[j] > b) {
                    break;
                }

                total += arr[j];
                count++;
            }

            maxRes = Math.max(maxRes, count);
        }

        System.out.print(maxRes);
    }
}
