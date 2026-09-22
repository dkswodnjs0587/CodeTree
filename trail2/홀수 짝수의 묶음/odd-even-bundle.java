import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        // Please write your code here.
        int even = 0;
        int odd = 0;

        for(int i = 0; i < N; i++) {
            if(numbers[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        int count = 0;

        while(true) {

            // 짝수 합 묶음
            if(count % 2 == 0) {

                if(even > 0) {
                    even--;
                }
                else if(odd >= 2) {
                    odd -= 2;
                }
                else {
                    break;
                }
            }

            // 홀수 합 묶음
            else {

                if(odd > 0) {
                    odd--;
                }
                else {
                    break;
                }
            }

            count++;
        }

        // 홀수가 1개 남은 경우
        // 현재 만들어진 마지막 묶음과 합쳐서 조정해야 함
        if(odd == 1) {
            count--;
        }

        System.out.println(count);
    }
}