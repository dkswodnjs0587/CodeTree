import java.util.Scanner;
public class Main {
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        // Please write your code here.
        int currentX = 0;
        int currentY = 0;
        int count = 0;
        int direction = 0;
        boolean isComplete = false;
        
        for(int i = 0; i < commands.length(); i++) {
            if(commands.charAt(i) == 'R') {
                direction = (direction + 1) % 4;
            }
            else if(commands.charAt(i) == 'L') {
                direction = (direction + 3) % 4;
            }
            else {
                currentX += dx[direction];
                currentY += dy[direction];
            }
            count++;

            if(currentX == 0 && currentY == 0) {
                isComplete = true;
                break;
            }
        }

        if(isComplete) {
            System.out.print(count);
        }
        else {
            System.out.print(-1);
        }
    }
}