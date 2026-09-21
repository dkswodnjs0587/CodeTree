import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int t = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();
            if(c == 'A') {
                a += s;
            }
            if(c == 'B') {
                b += s;
            }


            if(a == b && t != 0) {
                count++;
                t = 0;
            }
            if(a > b && t != 1) {
                count++;
                t = 1;
            }
            if(a < b && t != 2) {
                count++;
                t = 2;
            } 
        }
        // Please write your code here.

        System.out.print(count);
    }
}