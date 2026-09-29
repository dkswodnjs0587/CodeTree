import java.util.Scanner;

public class Main {

    static int[] merged_arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Please write your code here.
        merged_arr = new int[n];

        merge_sort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge_sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            merge_sort(arr, low, mid);
            merge_sort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                merged_arr[k] = arr[i];
                i++;
            } else {
                merged_arr[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            merged_arr[k] = arr[i];
            i++;
            k++;
        }

        while (j <= high) {
            merged_arr[k] = arr[j];
            j++;
            k++;
        }

        for (int a = low; a <= high; a++) {
            arr[a] = merged_arr[a];
        }
    }
}