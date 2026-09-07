import java.util.Scanner;
public class Main {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int count = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int temp = 0;
                for(int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if(nx >= n || nx < 0 || ny >= n || ny < 0) {
                        continue;
                    }

                    if(arr[nx][ny] == 1) {
                        temp++;
                    }
                }
                if(temp >= 3) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}