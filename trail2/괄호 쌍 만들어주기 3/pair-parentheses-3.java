import java.util.Scanner;
public class Main {
    int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // Please write your code here.
        int[] arr = new int[str.length()];
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(str.charAt(i) == '(') {
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != 0) {
                continue;
            }
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] == 1) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}