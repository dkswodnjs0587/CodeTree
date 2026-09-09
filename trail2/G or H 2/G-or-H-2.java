import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[101];
        for (int i = 0; i < n; i++) {
            int position = sc.nextInt();
            char ch = sc.next().charAt(0);
            if (ch == 'G') {
                arr[position] = -1;
            }
            else if (ch == 'H') {
                arr[position] = 1;
            }
        }
        // Please write your code here.
        int maxRes = 0;
        for (int i = 0; i < 100; i++) {
            if (arr[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < 101; j++) {
                if (arr[j] == 0) {
                    continue;
                }

                int gCount = 0;
                int hCount = 0;

                for(int k = i; k <= j; k++) {
                    if(arr[k] == -1) {
                        gCount++;
                    }
                    else if(arr[k] == 1) {
                        hCount++;
                    }
                }

                if(gCount == 0 || hCount == 0 || gCount == hCount) {
                    maxRes = Math.max(maxRes, j - i);
                }
            }
        }

        System.out.print(maxRes);
    }
}