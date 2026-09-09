import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] candies = new int[n];
        int[] positions = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
            positions[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] arr = new int[101];

        for(int i = 0; i < n; i++) {
            arr[positions[i]] += candies[i];
        }

        int maxRes = 0;

        for(int i = 0; i <= 100; i++) {
            int temp = 0;

            for(int j = -k; j <= k; j++) {
                int pos = i + j;

                if(pos < 0 || pos > 100) {
                    continue;
                }

                temp += arr[pos];
            }

            maxRes = Math.max(maxRes, temp);
        }

        System.out.print(maxRes);
    }
}