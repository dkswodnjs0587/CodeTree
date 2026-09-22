import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String s = br.readLine();

        LinkedList<Character> l = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            l.add(s.charAt(i));
        }

        ListIterator<Character> it = l.listIterator(l.size());

        for (int i = 0; i < m; i++) {
            String command = br.readLine();

            if (command.charAt(0) == 'L') {
                if (it.hasPrevious()) {
                    it.previous();
                }
            }

            else if (command.charAt(0) == 'R') {
                if (it.hasNext()) {
                    it.next();
                }
            }

            else if (command.charAt(0) == 'D') {
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            }

            else if (command.charAt(0) == 'P') {
                it.add(command.charAt(2));
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : l) {
            sb.append(c);
        }

        System.out.print(sb);
    }
}