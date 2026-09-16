import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        for (int i = 0; i < n - 1; i++)
            a[i] = sc.nextInt();
        // Please write your code here.
        int[] arr = new int[n];
        for(int i = 1; i <= 1000; i++) {
            boolean isPossible = true;
            boolean[] visited = new boolean[1001];
            arr[0] = i;
            visited[i] = true;
            for(int j = 1; j < n; j++) {
                arr[j] = a[j - 1]  - arr[j - 1];
                if(arr[j] < 1 || arr[j] > 1000 || visited[arr[j]]) {
                    isPossible = false;
                    break;
                }  
                visited[arr[j]] = true;
            }

            if(isPossible) {
                for(int j = 0; j < n; j++) {
                    System.out.print(arr[j] + " ");
                }
                break;
            }
        }
    }
}