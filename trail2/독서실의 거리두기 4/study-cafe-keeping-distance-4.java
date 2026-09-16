import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seat = sc.next();
        // Please write your code here.
        int maxResult = 0;

        for(int i = 0; i < n - 1; i++) {
            if(seat.charAt(i) == '1') {
                continue;
            }

            for(int j = i + 1; j < n; j++) {
                if(seat.charAt(j) == '1') {
                    continue;
                }

                char[] ch = seat.toCharArray();
                ch[i] = '1';
                ch[j] = '1';
                String str = new String(ch);
                
                int temp = Integer.MAX_VALUE;
                for(int k = 0; k < n - 1; k++) {
                    if(str.charAt(k) != '1') {
                        continue;
                    }
                    for(int l = k + 1; l < n; l++) {
                        if(str.charAt(l) != '1') {
                            continue;
                        }

                        temp = Math.min(temp, l - k);
                    }
                }

                maxResult = Math.max(maxResult, temp);
            }
        }

        System.out.println(maxResult);
    }
}
