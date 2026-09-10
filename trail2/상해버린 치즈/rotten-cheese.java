import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        int S = sc.nextInt();

        int[] eatPerson = new int[D];
        int[] eatCheese = new int[D];
        int[] eatTime = new int[D];
        for (int i = 0; i < D; i++) {
            eatPerson[i] = sc.nextInt();
            eatCheese[i] = sc.nextInt();
            eatTime[i] = sc.nextInt();
        }

        int[] sickPerson = new int[S];
        int[] sickTime = new int[S];
        for (int i = 0; i < S; i++) {
            sickPerson[i] = sc.nextInt();
            sickTime[i] = sc.nextInt();
        }

        // Please write your code here.
        int result = 0;

        // 1번부터 M번 치즈까지 하나씩 상했다고 가정
        for (int i = 1; i <= M; i++) {

            boolean possible = true;

            // 모든 아픈 사람 확인
            for (int j = 0; j < S; j++) {

                boolean ateBefore = false;

                for (int k = 0; k < D; k++) {
                    if (eatPerson[k] == sickPerson[j]
                            && eatCheese[k] == i
                            && eatTime[k] < sickTime[j]) {

                        ateBefore = true;
                        break;
                    }
                }

                // 아프기 전에 i번 치즈를 안 먹었다면 후보 탈락
                if (!ateBefore) {
                    possible = false;
                    break;
                }
            }

            // 상한 치즈 후보가 아니면 다음 치즈
            if (!possible) {
                continue;
            }

            // i번 치즈를 먹은 사람 수 계산
            boolean[] ate = new boolean[N + 1];

            for (int k = 0; k < D; k++) {
                if (eatCheese[k] == i) {
                    ate[eatPerson[k]] = true;
                }
            }

            int count = 0;

            for (int k = 1; k <= N; k++) {
                if (ate[k]) {
                    count++;
                }
            }

            result = Math.max(result, count);
        }

        System.out.println(result);
    }
}