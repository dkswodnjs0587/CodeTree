import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String seats = sc.next();
        // Please write your code here.
        int result = 0;

        for(int i = 0; i < N; i++) {

            if(seats.charAt(i) == '1') {
                continue;
            }

            int prev = -1;
            int minDist = Integer.MAX_VALUE;

            for(int j = 0; j < N; j++) {

                if(seats.charAt(j) == '1' || j == i) {

                    if(prev != -1) {
                        minDist = Math.min(minDist, j - prev);
                    }

                    prev = j;
                }
            }

            result = Math.max(result, minDist);
        }

        System.out.println(result);

    }
}