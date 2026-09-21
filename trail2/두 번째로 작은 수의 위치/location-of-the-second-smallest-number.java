import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++) {

            if(arr[i] < min) {
                secondMin = min;
                min = arr[i];
            }
            else if(arr[i] > min && arr[i] < secondMin) {
                secondMin = arr[i];
            }
        }

        int count = 0;
        int index = -1;

        for(int i = 0; i < N; i++) {
            if(arr[i] == secondMin) {
                count++;
                index = i + 1;
            }
        }

        if(count == 1) {
            System.out.println(index);
        }
        else {
            System.out.println(-1);
        }
    }
}