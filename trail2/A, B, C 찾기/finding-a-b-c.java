import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[1];
        int c;
        if(arr[2] ==  a + b) {
            c = arr[3];
        }
        else {
            c = arr[2];
        }

        System.out.print(a + " " + b + " " + c);
    }
}