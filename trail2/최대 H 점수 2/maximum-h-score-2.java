import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        // Please write your code here.
        Arrays.sort(a);

        int H = 0;

        for (int i = 0; i < n; i++) {
            H = Math.max(H, Math.min(a[i], n - i));
        }

        int high = 0;

        int equal = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] >= H + 1) {
                high++;
            } else if (a[i] == H) {
                equal++;
            }
        }

        int need = (H + 1) - high;

        if (need <= l && need <= equal) {
            H++;
        }

        System.out.println(H);
    }
}
