import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        // Please write your code here.
        int minCost = Integer.MAX_VALUE;

        for(int i = min; i <= max; i++) {
            int temp = 0;
            for(int j = 0; j < n; j++) {
                if (arr[j] < i) {
                    temp += i - arr[j];
                }
                else if (arr[j] > i + k) {
                    temp += arr[j] - (i + k);
                }
            }

            minCost = Math.min(minCost, temp);
        }

        System.out.print(minCost);
    }
}