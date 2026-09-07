import java.util.Scanner;
public class Main {
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int currentX = 0;
        int currentY = 0;
        int[][] arr = new int[n][m];
        int count = 1;
        arr[0][0] = count;
        count++;
        int direction = 0;

        while(count <= n*m) {
            int nx = currentX + dx[direction];
            int ny = currentY + dy[direction];

            if(nx < 0 || nx >= n || ny < 0 || ny >= m || arr[nx][ny] != 0) {
                direction = (direction + 1) % 4;
                continue;
            }
            else {
                arr[nx][ny] = count;

                count++;

                currentX = nx;
                currentY = ny;
            }
        }


        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}