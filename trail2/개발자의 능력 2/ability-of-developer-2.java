import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ability1 = sc.nextInt();
        int ability2 = sc.nextInt();
        int ability3 = sc.nextInt();
        int ability4 = sc.nextInt();
        int ability5 = sc.nextInt();
        int ability6 = sc.nextInt();
        // Please write your code here.
        int[] arr = new int[] {ability1, ability2, ability3, ability4, ability5, ability6};
        int result = Integer.MAX_VALUE;
        int total = ability1 + ability2 + ability3 + ability4 + ability5 + ability6;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    for (int l = 0; l < 6; l++) {
                        if (i == j || i == k || i == l || j == k || j == l || k == l) {
                            continue;
                        }

                        int teamA = arr[i] + arr[j];
                        int teamB = arr[k] + arr[l];
                        int teamC = total - teamA - teamB;
                        int maxTeam = Math.max(teamA, Math.max(teamB, teamC));
                        int minTeam = Math.min(teamA, Math.min(teamB, teamC));
                        result = Math.min(result, maxTeam - minTeam);
                    }
                }
            }
        }

        System.out.print(result);
    }
}
