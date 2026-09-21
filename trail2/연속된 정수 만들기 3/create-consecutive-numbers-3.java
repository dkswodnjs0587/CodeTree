import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int maxNum = Math.max(a, Math.max(b, c));
        int minNum = Math.min(a, Math.min(b, c));
        int midNum = a + b + c - maxNum - minNum;

        int result;

        if(maxNum - minNum == 2) {
            result = 0;
        }
        else if(maxNum - midNum > midNum - minNum) {
            result = maxNum - midNum - 1;
        }
        else {
            result = midNum - minNum - 1;
        }

        System.out.print(result);
    }
}