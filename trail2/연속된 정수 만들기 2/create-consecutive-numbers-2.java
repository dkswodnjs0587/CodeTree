import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;

        int result;

        if (mid - min == 1 && max - mid == 1) {
            result = 0;
        }
        else if (mid - min == 2 || max - mid == 2) {
            result = 1;
        }
        else {
            result = 2;
        }

        System.out.print(result);
    }
}