import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int minRes = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++) {
            int temp = 0;
            int maxX = 0;
            int minX = 40001;
            int maxY = 0;
            int minY = 40001;
            for(int j = 0; j < N; j++) {
                if(i == j) {
                    continue;
                }
                maxX = Math.max(maxX, x[j]);
                minX = Math.min(minX, x[j]);
                maxY = Math.max(maxY, y[j]);
                minY = Math.min(minY, y[j]);
            }

            temp = (maxX-minX) * (maxY - minY);
            minRes = Math.min(minRes, temp);
        }

        System.out.print(minRes);
    }
}