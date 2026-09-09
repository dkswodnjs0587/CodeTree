import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int maxRes = Integer.MIN_VALUE;

        for(int i = 0; i <= n - k; i++) {
            int temp = 0;
            for(int j = 0; j < k; j++) {
                temp += arr[i+j];
            }
            maxRes = Math.max(maxRes, temp);
        }

        System.out.print(maxRes);
    }
}