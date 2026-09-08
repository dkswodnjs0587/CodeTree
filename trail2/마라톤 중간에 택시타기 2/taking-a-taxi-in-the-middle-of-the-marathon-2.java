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
        int minDist = Integer.MAX_VALUE;

        for(int i = 1; i < n - 1; i++) {
            int temp = 0;

            int currentX = x[0];
            int currentY = y[0];

            for(int j = 1; j < n; j++) {
                if(i == j) {
                    continue;
                }
                temp += Math.abs(currentX - x[j]) + Math.abs(currentY - y[j]);

                currentX = x[j];
                currentY = y[j];
            }
            
            minDist = Math.min(minDist, temp);
        }

        System.out.print(minDist);
    }
}