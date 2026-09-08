import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int result = Integer.MAX_VALUE;
        int dist = 0;
        for(int i = 0; i < n; i++) {
            int temp = 0;
            for(int j = 0; j < n; j++) {
                temp += arr[j] * dist;
                if(j == n-1) {
                    continue;
                }
                dist = (dist+1) % n;
            }
            result = Math.min(result, temp);
        }

        System.out.print(result);
    }
}