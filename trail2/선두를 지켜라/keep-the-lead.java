import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][2];
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
        }
        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }
        // Please write your code here.
        int sumA = 0;
        int sumB = 0;

        for(int i = 0; i < n; i++) {
            sumA += A[i][1];
        }
        
        for(int i = 0; i < m; i++) {
            sumB += B[i][1];
        }

        int[] arrA = new int[sumA+1];
        int[] arrB = new int[sumB+1];
        arrA[0] = 0;
        arrB[0] = 0;

        int pos = 1;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < A[i][1]; j++) {
                arrA[pos] = arrA[pos-1] + A[i][0];
                pos++;
            }
        }

        pos = 1;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < B[i][1]; j++) {
                arrB[pos] = arrB[pos-1] + B[i][0];
                pos++;
            }
        }

        int count = 0;

        int leader = 0;

        int time = Math.min(sumA, sumB);

        for (int i = 1; i <= time; i++) {

            if (arrA[i] > arrB[i]) {
                if (leader == 2) {
                    count++;
                }

                leader = 1;
            }
            else if (arrA[i] < arrB[i]) {
                if (leader == 1) {
                    count++;
                }

                leader = 2;
            }
        }

        System.out.print(count);
    }
}