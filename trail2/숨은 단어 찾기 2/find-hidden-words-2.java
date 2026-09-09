import java.util.Scanner;
public class Main {
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {- 1, 0, 1, -1, 1, -1, 0, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        // Please write your code here.
        int count = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i].charAt(j) != 'L') {
                    continue;
                }

                for(int k = 0; k < 8; k++) {
                    int nx1 = i + dx[k];
                    int nx2 = i + dx[k] + dx[k];
                    int ny1 = j + dy[k];
                    int ny2 = j + dy[k] + dy[k];

                    if(nx1 < 0 || nx1 >= n || nx2 < 0 || nx2 >= n ||
                        ny1 < 0 || ny1 >= m || ny2 < 0 || ny2 >= m) {
                            continue;
                    }
                    
                    if(arr[nx1].charAt(ny1) == 'E' && arr[nx2].charAt(ny2) == 'E') {
                        count++;
                    }
                }
            }
        }

        System.out.print(count);
    }
}