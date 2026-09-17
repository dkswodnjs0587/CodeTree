import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int start = 101;
        int end = -1;
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            start = Math.min(start, x1[i]);
            end = Math.max(end, x2[i]);
        }

        // Please write your code here.
        int[] arr = new int[101];

        for(int i = 0; i < n; i++) {
            for(int j = x1[i]; j <= x2[i]; j++) {
                arr[j]++;
            }
        }

        boolean isConnect = false;

        for(int i = start; i <= end; i++) {
            if(arr[i] == n) {
                isConnect = true;
                break;
            }
        }

        if(isConnect) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}