import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int index = n - 1;

        while(index > 0) {
            if(arr[index - 1] < arr[index]) {
                index--;
            }
            else {
                break;
            }
        }

        System.out.println(index);
    }
}