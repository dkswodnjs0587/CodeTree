import java.util.Scanner;

public class Main {
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int[][] arr = new int[n][n];
        int currentX = n / 2;
        int currentY = n / 2;
        int direction = 0;
        arr[currentX][currentY] = 1;
        int count = 2;

        while (count <= n * n) {
            int nx = currentX + dx[direction];
            int ny = currentY + dy[direction];

            if(nx < 0 || nx >= n || ny < 0 || ny >= n || arr[nx][ny] > 0) {
                direction = (direction + 1) % 4;
                continue;
            }

            arr[nx][ny] = count;
            count++;
            currentX = nx;
            currentY = ny;
            
            int nextDirection = (direction + 1) % 4;

            int tx = currentX + dx[nextDirection];
            int ty = currentY + dy[nextDirection];

            if (tx >= 0 && tx < n &&
                ty >= 0 && ty < n &&
                arr[tx][ty] == 0) {

                direction = nextDirection;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}