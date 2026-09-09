import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        // Please write your code here.
        int total = a + b + c + d + e;
        int[] arr = new int[] {a, b, c, d, e};
        boolean canMake = false;
        int result = Integer.MAX_VALUE;

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                for(int k = 0; k < 5; k++) {
                    for(int l = 0; l < 5; l++) {
                        if(i == j || i == k || i == l || j == k  || j == l || k == l) {
                            continue;
                        }

                        int teamA = arr[i] + arr[j];
                        int teamB = arr[k] + arr[l];
                        int teamC = total - teamA - teamB;

                        if(teamA == teamB || teamA == teamC || teamB == teamC) {
                            continue;
                        }

                        canMake = true;

                        int maxTeam = Math.max(teamA, Math.max(teamB, teamC));
                        int minTeam = Math.min(teamA, Math.min(teamB, teamC));

                        result = Math.min(result, maxTeam - minTeam);
                    }
                }
            }
        }

        if(canMake) {
            System.out.print(result);
        }
        else {
            System.out.print(-1);
        }
        
    }
}
