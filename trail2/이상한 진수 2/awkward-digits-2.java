import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // Please write your code here.
        int pos = -1;

        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == '0') {
                pos = i;
                break;
            }
        }

        int result = 0;

        for(int i = 0; i < a.length(); i++) {
            if(i == pos) {
                result = result * 2 + 1;
                
            }
            else {
                result = result * 2+ (a.charAt(i) -'0');
            }
        }

        if(pos == -1) {
            result -= 1;
        }

        System.out.print(result);
    }
}