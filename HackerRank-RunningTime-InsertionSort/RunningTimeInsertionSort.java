import java.io.*;
import java.util.*;

public class RunningTimeInsertionSort {
    
    static int runningTime(int[] arr) {
        int shifts = 0;
        for (int i = 1; i < arr.length; i++) {
            int j;
            int x = arr[i];
            for (j = i-1; j >= 0; j--) {
                if (arr[j] <= x) {
                    break;
                }
                arr[j+1] = arr[j];
                shifts++;
            }
            arr[j+1] = x; //arr[j] becomes = -1 if element has to go to the beginning
        }
    return shifts;
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int[] arr = new int[n];
        int result = runningTime(arr);

        for (int r : result) {
            System.out.print(r + " ");
        }

        s.close();
    }
}
