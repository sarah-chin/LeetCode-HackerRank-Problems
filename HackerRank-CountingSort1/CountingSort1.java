import java.io.*;
import java.util.*;

public class CountingSort1 {

    // Complete the countingSort function below.
    static int[] countingSort(int n, int[] arr) {
        Arrays.sort(arr);
        int[] counts = new int[n + 1];
        for (int a : arr) {
            counts[a] = counts[a] + 1;
        }
        return counts;
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");

        for(int i=0; i<n; i++ ) {
            arr[i] = s.nextInt();
         }

        int[] result = countingSort(n, arr);

        for (int r : result) {
            System.out.print(r + " ");
        }

        s.close();
    }
}
