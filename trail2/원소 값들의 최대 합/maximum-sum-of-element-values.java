import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int maxRes = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int temp = arr[i];
            int sum = arr[i];

            for(int j = 0; j < m - 1; j++) {
                temp = arr[temp];
                sum += temp;
            }

            maxRes = Math.max(maxRes, sum);            
        }

        System.out.print(maxRes);
    }
}
