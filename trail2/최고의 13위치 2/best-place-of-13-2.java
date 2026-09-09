import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        // Please write your code here.
        int maxRes = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-2; j++) {
                int temp1 = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                
                for(int k = 0; k < n; k++) {
                    for(int l = 0; l < n-2; l++) {
                        if(i == k) {
                            if(!(j + 2 < l  || l + 2 < j)) {
                                continue;
                            }
                        }

                        int temp2 = arr[k][l] + arr[k][l+1] + arr[k][l+2];

                        maxRes = Math.max(maxRes, temp1 + temp2);
                    }
                }
            }
        }

        System.out.print(maxRes);
    }
}