import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();
        int[][] shakes = new int[T][3];
        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt();
            shakes[i][1] = sc.nextInt();
            shakes[i][2] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(shakes, (a, b) -> Integer.compare(a[0], b[0]));

        int[] arrHS = new int[N + 1];

        boolean[] arr = new boolean[N + 1];

        arrHS[P] = K;
        arr[P] = true;

        for (int i = 0; i < T; i++) {
            int person1 = shakes[i][1];
            int person2 = shakes[i][2];

            boolean canPerson1 = arr[person1] && arrHS[person1] > 0;
            boolean canPerson2 = arr[person2] && arrHS[person2] > 0;

            if (canPerson1 && !arr[person2]) {
                arr[person2] = true;
                arrHS[person2] = K;
            }

            if (canPerson2 && !arr[person1]) {
                arr[person1] = true;
                arrHS[person1] = K;
            }

            if (canPerson1) {
                arrHS[person1]--;
            }

            if (canPerson2) {
                arrHS[person2]--;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (arr[i]) {
                System.out.print(1);
            }
            else {
                System.out.print(0);
            }
        }
    }
}
