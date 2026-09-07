import java.util.Scanner;

public class Main {
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        String D = sc.next();
        // Please write your code here.
        int currentX = R;
        int currentY = C;

        int direction = -1;

        if(D.charAt(0) == 'U') {
            direction = 3;
        }
        else if(D.charAt(0) == 'D') {
            direction = 1;
        }
        else if(D.charAt(0) == 'R') {
            direction = 0;
        }
        else {
            direction = 2;
        }

        for (int i = 0; i < T; i++) {

            int nx = currentX + dx[direction];
            int ny = currentY + dy[direction];

            if (nx < 1 || nx > N || ny < 1 || ny > N) {
                direction = (direction + 2) % 4;
            }
            else {
                currentX = nx;
                currentY = ny;
            }
        }

        System.out.print(currentX + " " + currentY);
    }
}