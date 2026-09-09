import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[10001];
        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c == 'G') {
                arr[pos] = 1;
            }
            else if(c == 'H') {
                arr[pos] = 2;
            }
        }
        // Please write your code here.
        int maxRes = Integer.MIN_VALUE;
        for(int i = 0; i < 10001 - k; i++) {
            int temp = 0;
            for(int j = 0; j <= k; j++) {
                temp += arr[i+j];
            }
            maxRes = Math.max(maxRes, temp);
        }

        System.out.print(maxRes);
    }
}