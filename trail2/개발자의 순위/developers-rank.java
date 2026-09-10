import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int count = 0;

        for(int a = 1; a <= n; a++) {
            for(int b = 1; b <= n; b++) {

                if(a == b) {
                    continue;
                }

                boolean possible = true;

                for(int game = 0; game < k; game++) {
                    int aRank = -1;
                    int bRank = -1;

                    for(int j = 0; j < n; j++) {
                        if(arr[game][j] == a) {
                            aRank = j;
                        }

                        if(arr[game][j] == b) {
                            bRank = j;
                        }
                    }

                    // a가 b보다 순위가 낮은 경우
                    if(aRank > bRank) {
                        possible = false;
                        break;
                    }
                }

                if(possible) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}