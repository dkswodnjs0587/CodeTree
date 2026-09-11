import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] c = new char[T];
        int[] x = new int[T];
        for (int i = 0; i < T; i++) {
            c[i] = sc.next().charAt(0);
            x[i] = sc.nextInt();
        }
        // Please write your code here.
        char[] arr = new char[1001];
        int count = 0;
        for (int i = 0; i < T; i++) {
            arr[x[i]] = c[i];
        }

        for(int i = a; i <= b; i++) {
            int d1 = Math.min(checkLeft(arr, i, 'S'), checkRight(arr, i, 'S'));
            int d2 = Math.min(checkLeft(arr, i, 'N'), checkRight(arr, i, 'N'));

            if(d1 <= d2) {
                count++;
            }
        }

        System.out.print(count);
    }

    public static int checkLeft(char[] arr, int n, char c) {
        for (int i = n; i >= 0; i--) {
            if (arr[i] == c) {
                return n - i;
            }
        }

        return Integer.MAX_VALUE;
    }

    public static int checkRight(char[] arr, int n, char c) {
        for (int i = n; i < 1001; i++) {
            if (arr[i] == c) {
                return i - n;
            }
        }

        return Integer.MAX_VALUE;
    }
}
