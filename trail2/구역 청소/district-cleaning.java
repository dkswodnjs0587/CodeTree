import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        int total = 0;
        
        if(b >= d && a <= c) {
            total = b - a;
        }
        else if(d >= b && c <= a) {
            total = d - c;
        }
        else if(b <= d && b >= c) {
            total = d - a;
        }
        else if(d <= b && d >= a) {
            total = b - c;
        }
        else {
            total = (b - a) + (d - c);
        }

        System.out.print(total);
    }
}