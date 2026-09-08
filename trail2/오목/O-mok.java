import java.util.Scanner;

public class Main {
    static int[] dx = {0, 1, 1, -1};
    static int[] dy = {1, 0, 1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int winner = 0;
        int answerX = -1;
        int answerY = -1;

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {

                if (arr[i][j] == 0) {
                    continue;
                }

                int color = arr[i][j];

                for (int d = 0; d < 4; d++) {

                    boolean five = true;

                    for (int k = 1; k <= 4; k++) {

                        int nx = i + dx[d] * k;
                        int ny = j + dy[d] * k;

                        if (nx < 0 || nx >= 19 || ny < 0 || ny >= 19) {
                            five = false;
                            break;
                        }

                        if (arr[nx][ny] != color) {
                            five = false;
                            break;
                        }
                    }

                    if (!five) {
                        continue;
                    }

                    int bx = i - dx[d];
                    int by = j - dy[d];

                    if (bx >= 0 && bx < 19 && by >= 0 && by < 19) {
                        if (arr[bx][by] == color) {
                            continue;
                        }
                    }

                    int ax = i + dx[d] * 5;
                    int ay = j + dy[d] * 5;

                    if (ax >= 0 && ax < 19 && ay >= 0 && ay < 19) {
                        if (arr[ax][ay] == color) {
                            continue;
                        }
                    }

                    winner = color;
                    answerX = i + dx[d] * 2 + 1;
                    answerY = j + dy[d] * 2 + 1;

                    break;
                }

                if (winner != 0) {
                    break;
                }
            }

            if (winner != 0) {
                break;
            }
        }

        System.out.println(winner);

        if (winner != 0) {
            System.out.println(answerX + " " + answerY);
        }
    }
}