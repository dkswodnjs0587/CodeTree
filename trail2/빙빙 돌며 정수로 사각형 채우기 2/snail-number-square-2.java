import java.util.Scanner;
public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int[][] arr = new int[n][m];
        
        int currentX = 0;
        int currentY = 0;
        int direction = 0;
        arr[0][0] = 1;
        int count = 2;

        while (count <= n*m) {
            int nx = currentX + dx[direction];
            int ny = currentY + dy[direction];

            if(nx < 0 || nx >= n || ny < 0 || ny >= m || arr[nx][ny] > 0) {
                direction = (direction + 1) % 4;
                continue;
            }

            arr[nx][ny] = count;
            currentX = nx;
            currentY = ny;

            count++;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}