import java.util.Scanner;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int sum = 0;
        int direction = 0;
        int currentX = n / 2;
        int currentY = n / 2;
        sum += board[currentX][currentY];

        for(int i = 0; i < commands.length(); i++) {
            if(commands.charAt(i) == 'L') {
                direction = (direction + 3) % 4;
                continue;
            }
            else if(commands.charAt(i) == 'R') {
                direction = (direction + 1) % 4;
                continue;
            }
            
            int nx = currentX + dx[direction];
            int ny = currentY + dy[direction];

            if(nx < 0 || nx >= n || ny < 0 || ny >= n) {
                continue;
            }

            sum += board[nx][ny];
            currentX = nx;
            currentY = ny;
        }


        System.out.print(sum);
    }
}