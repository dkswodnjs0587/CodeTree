import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int minRes = Integer.MAX_VALUE;
        for(int i = 0; i < n - t + 1; i++) {
            int temp = 0;
            for(int j = 0; j < t; j++) {
                if(arr[i+j] == h) {
                    continue;
                }
                else {
                    temp += Math.abs(h - arr[i+j]);
                }
            }
            minRes = Math.min(minRes, temp);
        }

        System.out.print(minRes);
    }
}