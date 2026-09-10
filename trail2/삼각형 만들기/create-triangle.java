import java.util.Scanner;
public class Main {
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
        int maxRes = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                if(i == j || x[i] != x[j]) {
                    continue;
                }
                for(int k = 0; k < n; k++) {

                    if(i == k || j == k || y[i] != y[k]) {
                        continue;
                    }

                    int height = Math.abs(y[i] - y[j]);
                    int width = Math.abs(x[i] - x[k]);

                    int area = height * width;

                    maxRes = Math.max(maxRes, area);
                }
            }
        }

        System.out.print(maxRes);
    }
}