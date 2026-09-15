import java.util.Scanner;
public class Main {
    static int N, K;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = 0;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        // Please write your code here.
        N = n;
        K = k;

        int left = 0;
        int right = max;
        int answer = max;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (isPossible(mid)) {
                answer = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        System.out.println(answer);
    }

    public static boolean isPossible(int maxVal) {

        int[] availableIndices = new int[N];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] <= maxVal) {
                availableIndices[cnt++] = i;
            }
        }
        if (arr[0] > maxVal || arr[N - 1] > maxVal) {
            return false;
        }

        for (int i = 1; i < cnt; i++) {
            int dist = availableIndices[i] - availableIndices[i - 1];

            if (dist > K) {
                return false;
            }
        }

        return true;
    }
}
