import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int maxResult = Integer.MIN_VALUE;

        Arrays.sort(arr);

        for(int i = 0; i < n - 1; i++) {
            for(int j = n - 1; j > i; j--) {
                if(arr[j] - arr[i] <= k) {
                    maxResult = Math.max(maxResult, j - i + 1);
                }
            }
        }

        System.out.print(maxResult);
    }
}
