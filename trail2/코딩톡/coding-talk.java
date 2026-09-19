import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int p = sc.nextInt();
        char[] c = new char[M];
        int[] u = new int[M];
        for (int i = 0; i < M; i++) {
            c[i] = sc.next().charAt(0);
            u[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] lastMessage = new int[N];

        for (int i = 0; i < N; i++) {
            lastMessage[i] = -1;
        }

        for (int i = 0; i < M; i++) {
            lastMessage[c[i] - 'A'] = i;
        }

        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int last = lastMessage[i];

            int unreadAtLastMessage = (last == -1) ? 0 : u[last];

            if (u[p - 1] > unreadAtLastMessage) {
                answer.add((char)('A' + i));
            }
        }

        for (int i = 0; i < answer.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(answer.get(i));
        }
        System.out.println();
    }
}
