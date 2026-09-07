import java.util.Scanner;

public class Main {
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        int direction = 0;
        int[] currLoc = new int[] {0, 0};
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L') {
                if(direction == 0) {
                    direction = 3;
                } 
                else {
                    direction--;
                }
            }
            else if(s.charAt(i) == 'R') {
                if(direction == 3) {
                    direction = 0;
                }
                else {
                    direction++;
                }
            }
            else {
                currLoc[0] += dx[direction];
                currLoc[1] += dy[direction];
            }
        }

        System.out.print(currLoc[0] + " " + currLoc[1]);
    }
}