import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[M][2];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i][0] = a;
            arr[i][1] = b;
        }
        // Please write your code here.
        int maxResult = Integer.MIN_VALUE;

        for (int i = 0; i < M; i++) {
            int count = 0;
            int x = arr[i][0];
            int y = arr[i][1];
            for (int j = 0; j < M; j++) {
                if ((x == arr[j][0] && y == arr[j][1]) || (x == arr[j][1] && y == arr[j][0])) {
                    count++;
                }
            }

            maxResult = Math.max(maxResult, count);
        }

        System.out.print(maxResult);
    }
}
