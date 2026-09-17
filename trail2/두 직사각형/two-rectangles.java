import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        // Please write your code here.
        boolean isOverlap = true;

        if (x1 > a2) {
            isOverlap = false;
        }

        if (x2 < a1) {
            isOverlap = false;
        }

        if (y1 > b2) {
            isOverlap = false;
        }

        if (y2 < b1) {
            isOverlap = false;
        }

        if (isOverlap) {
            System.out.print("overlapping");
        }
        else {
            System.out.print("nonoverlapping");
        }
    }
}
