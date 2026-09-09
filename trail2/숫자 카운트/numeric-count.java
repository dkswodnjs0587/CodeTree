import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] count1 = new int[n];
        int[] count2 = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            count1[i] = sc.nextInt();
            count2[i] = sc.nextInt();
        }
        // Please write your code here.
        int count = 0;

        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                for(int k = 1; k <= 9; k++) {
                    if(i == j || i == k || j == k) {
                        continue;
                    }

                    boolean ispossible = true;

                    for(int l = 0; l < n; l++) {
                        int countA = 0;
                        int countB = 0;

                        int one = num[l] % 10;
                        int ten = (num[l] / 10) % 10;
                        int hund = num[l] / 100;

                        if(hund == i) countA++;
                        if(ten == j) countA++;
                        if(one == k) countA++;

                        if(hund == j || hund == k) countB++;
                        if(ten == i || ten == k) countB++;
                        if(one == i || one == j) countB++;

                        if(countA != count1[l] || countB != count2[l]) {
                            ispossible = false;
                            break;
                        }
                    }

                    if(ispossible) {
                        count++;
                    }
                }
            }
        }

        System.out.print(count);
    }
}