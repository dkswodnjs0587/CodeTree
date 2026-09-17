import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        // Please write your code here.
        boolean isCross = false;

        if(x2 >= x3 && x1 <= x3) {
            isCross = true;
        }

        if(x4 >= x1 && x4 <= x2) {
            isCross = true;
        }
        
        if(x4 >= x2 && x3 <= x1) {
            isCross = true;
        }

        if(x2 >= x4 && x3 >= x1) {
            isCross = true;
        }

        if(isCross) {
            System.out.print("intersecting");
        }
        else {
            System.out.print("nonintersecting");
        }
    }
}