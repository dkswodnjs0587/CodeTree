import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        int startNum = sc.nextInt();
        // Please write your code here.
        int direction = 0;
        int currentX = 0;
        int currentY = 0;

         // 위쪽
        if (startNum <= n) {
            direction = 2; // 아래로 이동
            currentX = 0;
            currentY = startNum - 1;
        }

        // 오른쪽
        else if (startNum <= 2 * n) {
            direction = 1; // 왼쪽으로 이동
            currentX = startNum - n - 1;
            currentY = n - 1;
        }

        // 아래쪽
        else if (startNum <= 3 * n) {
            direction = 0; // 위로 이동
            currentX = n - 1;
            currentY = 3 * n - startNum;
        }

        // 왼쪽
        else {
            direction = 3; // 오른쪽으로 이동
            currentX = 4 * n - startNum;
            currentY = 0;
        }

        int count = 0;

        while (true) {
            count++;

            if(grid[currentX][currentY] == '/') {
                direction = 3 - direction;
            }  
            else {
                direction ^= 1;
            } 

            int nx = currentX + dx[direction];
            int ny = currentY + dy[direction];

            if(nx < 0 || nx >= n || ny < 0|| ny >= n) {
                break;
            }

            currentX = nx;
            currentY = ny;
        }

        System.out.print(count);
    }
}