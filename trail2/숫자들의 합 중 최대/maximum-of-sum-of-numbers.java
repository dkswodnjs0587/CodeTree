import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.
        int maxRes = 0;
        for(int i = x; i <= y; i++) {
            maxRes = Math.max(maxRes, getSum(i));
        }

        System.out.print(maxRes);
    }

    public static int getSum(int n) {
        if(n == 0) {
            return 0;
        }

        return n % 10 + getSum(n/10);
    }
}