import java.util.*;

public class QuickSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input Array Size:");
        int inputArraySize = sc.nextInt();
        int inputArray[] = new int[inputArraySize];
        System.out.println("Enter " + inputArraySize + " Array Elements:");
        for (int index = 0; index < inputArray.length; index++) {
            inputArray[index] = sc.nextInt();
        }
         partition(inputArray, 0, inputArraySize - 1);
        System.out.println("After Applying quick sort");
        for (int i = 0; i < inputArraySize; i++) {
            System.out.println(inputArray[i]);
        }

    }

    static void partition(int inputArray[], int lb, int ub) {
        int pivote = inputArray[lb];
        int start = lb;
        int end = ub;
        int swap;
        if (lb < ub) {
            while (start < end) {
                while (inputArray[start] <= pivote && start <= ub) {
                    start++;
                }
                while (inputArray[end] > pivote && end >= lb) {
                    end--;
                }
                if (start < end) {
                    swap = inputArray[start];
                    inputArray[start] = inputArray[end];
                    inputArray[end] = swap;
                }
            }
            swap = inputArray[lb];
            inputArray[lb] = inputArray[end];
            inputArray[end] = swap;
            partition(inputArray, lb, ub - 1);
            partition(inputArray, lb + 1, ub);
        }

    }

}