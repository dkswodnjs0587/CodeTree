import java.util.Scanner;
public class Main {
    static int[][] team;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp1 = sc.next();
        String inp2 = sc.next();
        String inp3 = sc.next();
        // Please write your code here.
        int result = 0;
        team = new int[10][10];
        
        int[][] temp = new int[3][3];
            
        for(int j = 0; j < 3; j++) {
            temp[0][j] = inp1.charAt(j) - '0';
            temp[1][j] = inp2.charAt(j) - '0';
            temp[2][j] = inp3.charAt(j) - '0';
        }

        for(int j = 0; j < 3; j++) {
            count(temp[0][j], temp[1][j], temp[2][j]);
        }

        for(int j = 0; j < 3; j++) {
            count(temp[j][0], temp[j][1], temp[j][2]);
        }

        count(temp[0][0], temp[1][1], temp[2][2]);

        count(temp[0][2], temp[1][1], temp[2][0]);

        for(int i = 1; i < 9; i++) {
            for(int j = i + 1; j < 10; j++) {
                if(i == j) {
                    continue;
                }

                if(team[i][j] == 1) {
                    result++;
                }
            }
        }

        System.out.print(result);
    }

    public static void count(int a, int b, int c) {
        if(a == b && a == c) {
            return;
        }
        else if(a == b && b != c) {
            team[a][c] = 1;
            team[c][a] = 1;            
        }
        else if(a == c && b != a) {
            team[a][b] = 1;
            team[b][a] = 1;
        } 
        else if(b == c && a != b) {
            team[a][c] = 1;
            team[c][a] = 1;
        }
        else {
            return;
        }
    }
}
