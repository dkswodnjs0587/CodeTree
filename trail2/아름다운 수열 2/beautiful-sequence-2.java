import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++)
            B[i] = sc.nextInt();
        // Please write your code here.
        int count = 0;
        Arrays.sort(B);
        
        for(int i = 0; i <= N - M; i++) {
            int[] temp = new int[M];
            for(int j = 0; j < M; j++) {
                temp[j] = A[i+j];
            }
            Arrays.sort(temp);
            boolean isBeauty = true;
            for(int j = 0; j < M; j++) {
                if(B[j] != temp[j]) {
                    isBeauty = false;
                    break;
                }
            }

            if(isBeauty) {
                count++;
            }
        }

        System.out.print(count);
    }
}