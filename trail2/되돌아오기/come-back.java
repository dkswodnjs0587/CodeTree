import java.util.Scanner;
public class Main {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] dir = new char[n];
        int[] dist = new int[n];
        for(int i = 0; i < n; i++){
            dir[i] = sc.next().charAt(0);
            dist[i] = sc.nextInt();
        }
        // Please write your code here.
        int count = 0;
        boolean isComplete = false;
        int currentX = 0;
        int currentY = 0;
        int direction = 0;

        for(int i = 0; i < n; i++) {
            switch (dir[i]) {
                case 'N':
                    direction = 3;    
                    break;
                case 'S':
                    direction = 2;
                    break;
                case 'W':
                    direction = 0;
                    break;
                default:
                    direction = 1;
                    break;
            }
            
            for(int j = 0; j < dist[i]; j++) {
                currentX += dx[direction];
                currentY += dy[direction];
                count++;

                if(currentX == 0 && currentY == 0) {
                    isComplete = true;
                    break;
                }
            }

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