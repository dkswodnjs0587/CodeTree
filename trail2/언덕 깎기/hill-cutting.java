import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int minCost = Integer.MAX_VALUE;

        for (int i = 0; i <= 83; i++) {
            int cost = 0;
            for (int j = 0; j < n; j++) {
                if(arr[j] < i) {
                    int diff = i - arr[j];

                    cost += diff * diff;
                }

                else if(arr[j] > i + 17) {
                    int diff = arr[j] - (i + 17);
                    cost += diff * diff;
                }
            }

            minCost = Math.min(minCost, cost);
        }

        System.out.print(minCost);
    }
}
