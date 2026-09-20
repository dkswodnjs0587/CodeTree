import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.
        int tempX = Math.min(x, y);
        int tempY = Math.max(x, y);

        int tempA = Math.min(A, B);
        int tempB = Math.max(A, B);

        int minRes = Math.min(Math.abs(tempX-tempA) + Math.abs(tempY - tempB), tempB - tempA);

        System.out.print(minRes);
    }
}