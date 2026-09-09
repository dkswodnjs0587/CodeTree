import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ability = new int[6];
        int total = 0;
        for (int i = 0; i < 6; i++) {
            ability[i] = sc.nextInt();
            total += ability[i];
        }
        // Please write your code here.
        int minRes = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 6; k++) {
                    int temp = 0;
                    temp = ability[i] + ability[j] + ability[k];
                    int oppos = total - temp;
                    minRes = Math.min(minRes, Math.abs(oppos - temp));
                }
            }
        }

        System.out.print(minRes);
    }
}
