import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        // Please write your code here.
        int maxCount = 0;
        for (int i = 0; i < 3; i++) {
            int count = 0;
            int[] arr = new int[3];
            arr[i] = 1;
    
            for(int j = 0; j < n; j++) {
                int temp = arr[a[j] - 1];
                arr[a[j] - 1] = arr[b[j] - 1];
                arr[b[j] - 1] = temp;

                if(arr[c[j] - 1] == 1) {
                    count++;
                }
            }

            maxCount = Math.max(maxCount, count);
        }

        System.out.print(maxCount);
    }
}
