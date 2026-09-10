import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.
        int count = 0;
        for (int i = x; i <= y; i++) {
            if (check(i)) {
                count++;
            }
        }

        System.out.print(count);
    }

    public static boolean check(int n) {
        int[] count = new int[10];
        int length = 0;

        while (n > 0) {
            count[n % 10]++;
            n /= 10;
            length++;
        }

        for (int i = 0; i < 10; i++) {
            if (count[i] == 1) {
                for (int j = 0; j < 10; j++) {
                    if (count[j] == length - 1) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
