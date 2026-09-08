import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int result = -1;
        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(checkNum(arr[i], arr[j], arr[k])) {
                        result = Math.max(result, arr[i] + arr[j] + arr[k]);
                    }
                }
            }
        }

        System.out.print(result);
    }

    public static boolean checkNum(int a, int b, int c) {
        if(a == 0 && b == 0 && c == 0) {
            return true;
        }

        if(a%10 + b%10 + c%10 >= 10) {
            return false;
        }
        else {
            return checkNum(a/10, b/10, c/10);
        }
    }
}