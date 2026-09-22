import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[1];
        int c;
        int d;
        if(a + b == arr[2]) {
            c = arr[3];
        }
        else {
            c = arr[2];
        }

        d = arr[14] - a - b - c;

        System.out.print(a + " " + b + " " + c + " " + d);
    }
}