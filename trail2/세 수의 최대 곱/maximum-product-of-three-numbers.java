import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(arr);
        int result = 0;

        result = Math.max((arr[0] * arr[1]), (arr[n-3] * arr[n-2]));

        if(arr[n-1] < 0) {
            result = arr[n-3] * arr[n-2] * arr[n-1];
        }
        else {
            result *= arr[n-1];
        }

        System.out.print(result);
    }
}
