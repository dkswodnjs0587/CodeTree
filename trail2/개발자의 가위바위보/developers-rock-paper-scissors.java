import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        // Please write your code here.
        int maxWin = 0;

        // 1이 2를 이기고, 2가 3을 이기고, 3이 1을 이기는 경우
        int win1 = 0;

        for(int i = 0; i < n; i++) {
            if((a[i] == 1 && b[i] == 2) ||
               (a[i] == 2 && b[i] == 3) ||
               (a[i] == 3 && b[i] == 1)) {
                win1++;
            }
        }

        // 반대 관계
        // 1이 3을 이기고, 3이 2를 이기고, 2가 1을 이기는 경우
        int win2 = 0;

        for(int i = 0; i < n; i++) {
            if((a[i] == 1 && b[i] == 3) ||
               (a[i] == 3 && b[i] == 2) ||
               (a[i] == 2 && b[i] == 1)) {
                win2++;
            }
        }

        maxWin = Math.max(win1, win2);

        System.out.println(maxWin);
    }
}