import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        // Please write your code here.
        int count = 0;
        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    int[] arr = new int[101];
                    boolean isCan = true;
                    for(int l = 0; l < n; l++) {
                        if(l == i || l == j || l == k) {
                            continue;
                        }
                        for(int z = a[l]; z <= b[l]; z++) {
                            arr[z]++;
                        }
                    }

                    for(int l = 0; l < 101; l++) {
                        if(arr[l] > 1) {
                            isCan = false;
                            break;
                        }
                    }

                    if(isCan) {
                        count++;
                    }
                }
            }
        }

        System.out.print(count);
    }
}