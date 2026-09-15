import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] temp = new int[15];
        boolean isPossible = true;
        Arrays.sort(arr);

        for(int a = 1; a <= arr[14]; a++) {
            for(int b = a; b <= arr[14]; b++) {
                for(int c = b; c <= arr[14]; c++) {
                    for(int d = c; d <= arr[14]; d++) {
                        isPossible = true;
                        temp[0] = a + b;
                        temp[1] = b + c;
                        temp[2] = c + d;
                        temp[3] = d + a;
                        temp[4] = a + c;
                        temp[5] = b + d;
                        temp[6] = a + b + c;
                        temp[7] = a + b + d;
                        temp[8] = a + c + d;
                        temp[9] = b + c + d;
                        temp[10] = a + b + c + d;
                        temp[11] = a;
                        temp[12] = b;
                        temp[13] = c;
                        temp[14] = d;

                        Arrays.sort(temp);

                        for(int i = 0; i < 15; i++) {
                            if(arr[i] != temp[i]) {
                                isPossible = false;
                                break;
                            }
                        }

                        if(isPossible) {
                            System.out.print(a + " " + b + " " + c + " " + d);
                            return;
                        }
                    }
                }
            }
        }
    }
}