import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int minRes = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            int[] temp1 = new int[n]; 
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    temp1[j] = arr[j] * 2;
                }
                else {
                    temp1[j] = arr[j];
                }
            }

            for(int j = 0; j < n; j++) {
                int count = 0;
                int[] temp2 = new int[n-1];
                for(int k = 0; k < n; k++) {
                    if(j == k) {
                        continue;
                    }
                    temp2[count] = temp1[k];
                    count++;
                }

                int sum = 0;
                for(int k = 0; k < n - 2; k++) {
                    sum += Math.abs(temp2[k] - temp2[k+1]);
                }

                minRes = Math.min(minRes, sum);
            }
        }

        System.out.print(minRes);
    }
}
