import java.util.*;

public class Main {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] points = new int[m][2];
        
        for (int i = 0; i < m; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        // Please write your code here.
        int[][] arr = new int[n][n];
        int[] result = new int[m];
        
        for(int i = 0; i < n; i++) {
            Arrays.fill(arr[i], 0);
        }

        Arrays.fill(result, 0);

        for(int i = 0; i < m; i++) {
            arr[points[i][0]-1][points[i][1]-1] = 1;
            int temp = 0;

            for(int j = 0; j < 4; j++) {
                int nx = points[i][0] + dx[j] - 1;
                int ny = points[i][1] + dy[j] - 1;

                if(nx < 0 || nx >= n || ny < 0 || ny >= n) {
                    continue;
                }

                if(arr[nx][ny] == 1) {
                    temp++;
                }
            } 

            if(temp == 3) {
                result[i] = 1;
            }
        }

        for(int i = 0; i < m; i++) {
            System.out.println(result[i]);
        }
    }
}