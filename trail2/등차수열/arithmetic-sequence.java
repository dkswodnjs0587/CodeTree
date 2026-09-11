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
        int max = getMax(arr);
        int maxCount = 0;
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < max; i++) {
            int temp = 0;
            for(int j = 0; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(arr[k] - i == i - arr[j]) {
                        temp++;
                    }
                }
            }
            if(temp > maxCount) {
                maxCount = temp;
            }
        }

        System.out.print(maxCount);
    }

    public static int getMax(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            temp = Math.max(temp, arr[i]);
        }

        return temp;
    }
}