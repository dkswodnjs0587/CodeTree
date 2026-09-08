import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        int n = input.length();
        int count = 0;
        for(int i = 0; i < n - 3; i++) {
            if(input.charAt(i) == '(' && input.charAt(i+1) == '(') {
                int temp = 0;
                for(int j = i + 3; j < n; j++) {
                    if(input.charAt(j-1) == ')' && input.charAt(j) == ')') {
                        count++;
                    }
                }
            }
        }

        System.out.print(count);
    }
}