import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] board = new String[10];
        for (int i = 0; i < 10; i++) {
            board[i] = sc.next();
        }
        // Please write your code here.
        int startX = -1;
        int startY = -1;
        int endX = -1; 
        int endY = -1;
        int rx = -1;
        int ry = -1;
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if(board[i].charAt(j) == 'L') {
                    startX = i;
                    startY = j;
                }
                if(board[i].charAt(j) == 'B') {
                    endX = i;
                    endY = j;
                }
                if(board[i].charAt(j) == 'R') {
                    rx = i;
                    ry = j;
                }
            }
        }

        if((startX == endX && startX == rx && ((startY > ry && ry > endY)||(ry > startY &&ry < endY)))||(startY == endY && startY == ry && ((startX > rx && rx > endX)||(rx > startX &&rx < endX)))) {
            System.out.print(Math.abs(startX - endX) + Math.abs(startY - endY) + 1);
        }
        else {
            System.out.print(Math.abs(startX - endX) + Math.abs(startY - endY) - 1);
        }
    }
}