import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // Please write your code here.

        int left = 1;
        int right = x;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // mid초 동안 이동할 수 있는 최대 거리
            int maxDistance = mid + (mid - 1) * (mid - 1) / 4;

            if (maxDistance >= x) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(left);
    }
}