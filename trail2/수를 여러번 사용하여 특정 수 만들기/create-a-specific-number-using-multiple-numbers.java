import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int maxRes = Integer.MIN_VALUE;
        int x = C / A;
        int y = C / B;
        for(int i = 0; i < x + 1; i++) {
            for(int j = 0; j < y + 1; j++) {
                int sum = (A * i) + (B * j);

                if(sum > C) {
                    continue;
                }

                maxRes = Math.max(maxRes, sum);
            }
        }

        System.out.print(maxRes);
    }
}