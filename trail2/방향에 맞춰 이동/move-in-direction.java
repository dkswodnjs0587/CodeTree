import java.util.Scanner;
public class Main {
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] currLoc = new int[]{0, 0};
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            // Please write your code here.'
            if(direction == 'N') {
                currLoc[1] += distance*dy[2];
            }
            else if(direction == 'S') {
                currLoc[1] += distance*dy[1];
            }
            else if(direction == 'W') {
                currLoc[0] += distance*dx[0];
            }
            else {
                currLoc[0] += distance*dx[3];
            }
        }

        System.out.print(currLoc[0] + " " + currLoc[1]);
    }
}