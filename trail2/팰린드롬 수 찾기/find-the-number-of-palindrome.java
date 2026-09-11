import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.
        int count = 0;
        for(int i = x; i <= y; i++) {
            int[] arr = new int[getLen(i)];
            arr = setArr(i);
            boolean isCan = true;

            for(int j = 0; j < getLen(i)/2; j++) {
                if(arr[j] != arr[getLen(i) - j - 1]) {
                    isCan = false;
                }
            }

            if(isCan) {
                count++;
            }
        }

        System.out.print(count);
    }
    
    public static int[] setArr(int x) {
        int[] temp = new int[getLen(x)];
        int n = x;
        for(int i = 0; i < temp.length; i++) {
            temp[i] = x % 10;
            x /= 10;
        }

        return temp;
    }

    public static int getLen(int x) {
        int temp = 0;
        int n = x;
        while(n > 0) {
            n /= 10;
            temp++;
        }

        return temp;
    }
}