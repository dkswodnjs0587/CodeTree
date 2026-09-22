import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String state = "ABC";
        int a = 0;
        int b = 0;
        int c = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            char x = sc.next().charAt(0);
            int s = sc.nextInt();

            if (x == 'A') {
                a += s;
            }
            else if (x == 'B') {
                b += s;
            }
            else {
                c += s;
            }

            if (a > b && a > c && !state.equals("A")) {
                count++;
                state = "A";
            }
            else if (b > a && b > c && !state.equals("B")) {
                count++;
                state = "B";
            }
            else if (c > a && c > b && !state.equals("C")) {
                count++;
                state = "C";
            }
            else if (a == b && a > c && !state.equals("AB")) {
                count++;
                state = "AB";
            }
            else if (a == c && a > b && !state.equals("AC")) {
                count++;
                state = "AC";
            }
            else if (b == c && b > a && !state.equals("BC")) {
                count++;
                state = "BC";
            }
            else if (a == b && a == c && !state.equals("ABC")) {
                count++;
                state = "ABC";
            }
        }
        // Please write your code here.
        System.out.print(count);
    }
}
