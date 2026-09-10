import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        // Please write your code here.
        int maxRes = 0;

        for (int i = 0; i < N; i++) {
            int[] arr = new int[1001];
            int temp = 0;
            for (int j = 0; j < N; j++) {
                
                if (j == i) {
                    continue;
                }

                for (int k = A[j]; k < B[j]; k++) {
                    arr[k]++;
                }
            }

            for (int k = 0; k < 1001; k++) {
                    if (arr[k] > 0) {
                        temp++;
                    }
                }

                maxRes = Math.max(maxRes, temp);
        }

        System.out.print(maxRes);
    }
}
