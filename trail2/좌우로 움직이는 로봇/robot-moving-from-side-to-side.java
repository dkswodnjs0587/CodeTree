import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int sumA = 0;
        int sumB = 0;
        int[] timeA = new int[n];
        int[] timeB = new int[m];
        char[] dirA = new char[n];
        char[] dirB = new char[m];

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            timeA[i] = t;
            dirA[i] = d;
            sumA += t;
        }
        
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            timeB[i] = t;
            dirB[i] = d;
            sumB += t;
        }
        
        // Please write your code here.

        int[] arrA = new int[sumA+1];
        int[] arrB = new int[sumB+1];

        arrA[0] = 0;
        arrB[0] = 0;

        int pos = 1;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < timeA[i]; j++) {
                if(dirA[i] == 'L') {
                    arrA[pos] = arrA[pos-1] - 1;
                }
                else {
                    arrA[pos] = arrA[pos-1] + 1;
                }
                pos++;
            }
        }

        pos = 1;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < timeB[i]; j++) {
                if(dirB[i] == 'L') {
                    arrB[pos] = arrB[pos-1] - 1;
                }
                else {
                    arrB[pos] = arrB[pos-1] + 1;
                }
                pos++;
            }
        }

        int count = 0;

        for(int i = 1; i <= Math.max(sumA, sumB); i++) {
            if(sumA > sumB && i > sumB) {
                if(arrA[i] == arrB[sumB] && arrA[i-1] != arrB[sumB]) {
                    count++;
                }    
            }
            else if(sumA < sumB && i > sumA) {
                if(arrA[sumA] == arrB[i] && arrA[sumA] != arrB[i-1]) {
                    count++;
                }
            }
            else {
                if(arrA[i] == arrB[i] && arrA[i-1] != arrB[i-1]) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}