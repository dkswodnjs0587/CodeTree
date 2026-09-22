import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
            total += blocks[i];
        }
        // Please write your code here.
        int target = total / n;
        int result = 0;

        for(int i = 0; i < n; i++) {
            result += Math.abs(target - blocks[i]);
        }

        System.out.print(result/2); 
    }
}