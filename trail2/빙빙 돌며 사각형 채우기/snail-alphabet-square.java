import java.util.*;
public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                        'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int count = 1;
        int direction = 0;
        char[][] arr = new char[n][m];
        int currentX = 0;
        int currentY = 0;
        arr[0][0] = alpha[0];

        while(count < n*m) {
            int nx = currentX + dx[direction];
            int ny = currentY + dy[direction];

            if(nx < 0 || nx >= n || ny < 0 || ny >= m || arr[nx][ny] != '\0') {
                direction = (direction + 1) % 4;
                continue;
            }

            arr[nx][ny] = alpha[count%26];
            count++;

            currentX = nx;
            currentY = ny;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}