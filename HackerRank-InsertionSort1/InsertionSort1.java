import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        // rightmost cell is the unsorted number
        int to_sort = arr[n-1];
        int j = 0;
        
        for (int i = n-1; i > 0 && arr[i-1] > to_sort; i--) {
            arr[i] = arr[i-1];
            print(arr);
            System.out.println();
            j = i-1;
        }
        arr[j] = to_sort;
        print(arr);

    }

    static void print(int[] arr) {
        for (int a: arr) {
            System.out.print(a + " ");
        }     
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}
