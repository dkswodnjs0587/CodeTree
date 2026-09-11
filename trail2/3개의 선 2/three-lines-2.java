import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        // Please write your code here.

        boolean possible = false;

        for (int i = 0; i < n; i++) {

            // 0 : 세로선, 1 : 가로선
            for (int d1 = 0; d1 < 2; d1++) {

                boolean[] check1 = new boolean[n];

                // 첫 번째 직선
                for (int a = 0; a < n; a++) {
                    if (d1 == 0 && x[a] == x[i]) {
                        check1[a] = true;
                    }

                    if (d1 == 1 && y[a] == y[i]) {
                        check1[a] = true;
                    }
                }

                // 첫 번째 직선 이후 남은 점 찾기
                int first = -1;

                for (int a = 0; a < n; a++) {
                    if (!check1[a]) {
                        first = a;
                        break;
                    }
                }

                // 한 직선만으로 모두 가능
                if (first == -1) {
                    possible = true;
                    break;
                }

                // 두 번째 직선 방향
                for (int d2 = 0; d2 < 2; d2++) {

                    boolean[] check2 = check1.clone();

                    for (int a = 0; a < n; a++) {
                        if (d2 == 0 && x[a] == x[first]) {
                            check2[a] = true;
                        }

                        if (d2 == 1 && y[a] == y[first]) {
                            check2[a] = true;
                        }
                    }

                    // 두 번째 직선 이후 남은 점 찾기
                    int second = -1;

                    for (int a = 0; a < n; a++) {
                        if (!check2[a]) {
                            second = a;
                            break;
                        }
                    }

                    // 두 직선만으로 모두 가능
                    if (second == -1) {
                        possible = true;
                        break;
                    }

                    // 세 번째 직선을 세로로 그을 수 있는지
                    boolean vertical = true;

                    for (int a = 0; a < n; a++) {
                        if (!check2[a] && x[a] != x[second]) {
                            vertical = false;
                            break;
                        }
                    }

                    // 세 번째 직선을 가로로 그을 수 있는지
                    boolean horizontal = true;

                    for (int a = 0; a < n; a++) {
                        if (!check2[a] && y[a] != y[second]) {
                            horizontal = false;
                            break;
                        }
                    }

                    if (vertical || horizontal) {
                        possible = true;
                        break;
                    }
                }

                if (possible) {
                    break;
                }
            }

            if (possible) {
                break;
            }
        }

        System.out.println(possible ? 1 : 0);
    }
}