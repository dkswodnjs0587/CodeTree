import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        int[] M = new int[N];
        for (int i = 0; i < N; i++) {
            int pigeon = sc.nextInt();
            int moveDir = sc.nextInt();
            P[i] = pigeon;
            M[i] = moveDir;
        }
        // Please write your code here.
        int count = 0;
        int[] loc = new int[101];
        Arrays.fill(loc, -1);
        for(int i = 0; i < N; i++) {
            if(loc[P[i]] == -1) {
                loc[P[i]] = M[i];
                continue;
            }

            if(loc[P[i]] != M[i]) {
                count++;
                loc[P[i]] = M[i];
            }
            
        }

        System.out.print(count);
    }
}
