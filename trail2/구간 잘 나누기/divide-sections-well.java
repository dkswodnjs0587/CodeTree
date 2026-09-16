import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N];

        int left = 0;
        int right = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();

            // 최소 가능값
            left = Math.max(left, arr[i]);

            // 최대 가능값
            right += arr[i];
        }

        int result = right;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (isPossible(mid)) {
                result = mid;

                // 더 작은 값도 가능한지 확인
                right = mid - 1;
            }
            else {
                // mid로는 불가능 → 더 크게
                left = mid + 1;
            }
        }

        System.out.println(result);
    }

    public static boolean isPossible(int maxSum) {

        int count = 1;
        int sum = 0;

        for (int i = 0; i < N; i++) {

            // 현재 구간에 넣었을 때 maxSum 초과
            if (sum + arr[i] > maxSum) {
                count++;
                sum = arr[i];
            }
            else {
                sum += arr[i];
            }
        }

        return count <= M;
    }
}