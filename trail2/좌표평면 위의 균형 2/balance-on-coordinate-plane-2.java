import java.util.Scanner;
public class Main {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        arr = new int[101][101];
        int minRes = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            arr[x[i]][y[i]]++;
        }

        for(int i = 2; i < 100; i += 2) {
            for(int j = 2; j < 100; j += 2) {
                int temp = 0;
                temp = Math.max(getDot(0, i, 0, j), Math.max(getDot(0, i, j, 101), Math.max(getDot(i, 101, 0, j), getDot(i, 101, j, 101))));
                minRes = Math.min(minRes, temp);
            }
        }

        System.out.print(minRes);
    }

    public static int getDot(int startX, int endX, int startY, int endY) {
        int temp = 0;
        for(int i = startX; i < endX; i++) {
            for(int j = startY; j < endY; j++) {
                if(arr[i][j] == 1) {
                    temp++;
                }
            }
        }

        return temp;
    }
}