import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        // Please write your code here.
        int maxRes = Integer.MIN_VALUE;
        for(int i = 0; i < getMax(h); i++) {
            int temp = 0;
            boolean isIceBefore = false;
            for(int j = 0; j < n; j++) {
                if(h[j] - i <= 0) {
                    isIceBefore = false;
                    continue;
                }
                if(!isIceBefore) {
                    temp++;
                    isIceBefore = true;
                }
            }
            maxRes = Math.max(maxRes, temp);
        }

        System.out.print(maxRes);
    }

    public static int getMax(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            temp = Math.max(temp, arr[i]);
        }

        return temp;
    }
}