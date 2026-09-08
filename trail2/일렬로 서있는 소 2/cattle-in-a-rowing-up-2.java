import java.util.Scanner;

public class Main {
    static int N;
    static int R = 3;
    static int total;
    static int[][] result;
    static int[] selected;
    static int[] arr;
    static int index = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        total = 0;
        N = n;
        combination(0, 0);
        result = new int[total][3];
        selected = new int[3];
        getCombination(0, 0);
        int ans = 0;

        for(int i = 0; i < total; i++) {
            if(result[i][0] <= result[i][1] && result[i][1] <= result[i][2]) {
                ans ++;
            }
        }
        System.out.print(ans);
    }

    public static void combination(int cnt, int start) {
        if (cnt == R) {
            total++;
            return;
        }

        for (int i = start; i < N; i++) {
            combination(cnt + 1, i + 1);
        }
    }

    public static void getCombination(int cnt, int start) {
        if(cnt == R) {
            for(int i = 0; i < 3; i++) {
                result[index][i] = selected[i];
            }
            index++;
            return;
        }

        for(int i = start; i < N; i++) {
            selected[cnt] = arr[i];

            getCombination(cnt + 1, i + 1);
        }
    }
}
