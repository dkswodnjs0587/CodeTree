import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][2];
        int[][] b = new int[m][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();
        }
        // Please write your code here.
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i][1];
        }

        int[] arrA = new int[sum + 1];
        int[] arrB = new int[sum + 1];
        
        arrA[0] = 0;
        arrB[0] = 0;

        int pos = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[i][1]; j++) {
                arrA[pos] = arrA[pos - 1] + a[i][0];
                pos++;
            }
        }

        pos = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < b[i][1]; j++) {
                arrB[pos] = arrB[pos - 1] + b[i][0];
                pos++;
            }
        }

        int[] result = new int[sum+1];

        for (int i = 1; i <= sum; i++) {
            if (arrA[i] > arrB[i]) {
                result[i] = 1;
            }
            else if (arrA[i] < arrB[i]) {
                result[i] = 2;
            }
            else {
                result[i] = 3;
            }
        }

        int count = 0;

        for(int i = 1; i <= sum; i++) {
            if(result[i] != result[i-1]) {
                count++;
            }
        }

        System.out.print(count);
    }
}
