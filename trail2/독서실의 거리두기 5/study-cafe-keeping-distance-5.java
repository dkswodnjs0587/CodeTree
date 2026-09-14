import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seat = sc.next();
        // Please write your code here.
        int leftSeat = -1;

        // 기존 사람들 사이 최소 거리
        int minDist = Integer.MAX_VALUE;

        // 새 사람을 앉혔을 때 만들 수 있는 최대 거리
        int maxDist = 0;

        for (int i = 0; i < n; i++) {
            if (seat.charAt(i) == '1') {

                if (leftSeat == -1) {
                    // 맨 앞에 앉는 경우
                    maxDist = i;
                } else {
                    // 기존 사람 사이 거리
                    int dist = i - leftSeat;

                    // 기존 사람들 사이 최소 거리
                    minDist = Math.min(minDist, dist);

                    // 두 사람 사이에 새 사람을 앉히는 경우
                    maxDist = Math.max(maxDist, dist / 2);
                }

                leftSeat = i;
            }
        }

        // 마지막 사람 뒤에 앉는 경우
        maxDist = Math.max(maxDist, n - 1 - leftSeat);

        // 기존 최소 거리와 새롭게 만들 수 있는 거리 중 작은 값
        int result = Math.min(minDist, maxDist);

        System.out.print(result);
    }
}
