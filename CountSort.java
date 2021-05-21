
import java.util.*;
public class CountSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input Array Size:");
        int inputArraySize = sc.nextInt();
        int inputArray[] = new int[inputArraySize];
        System.out.println("Enter " + inputArraySize + " Array Elements:");
        for (int index = 0; index < inputArray.length; index++) {
            inputArray[index] = sc.nextInt();
        }
    
        int k=inputArray.length;         
        count(inputArray,k);
          System.out.println("After Applying Count sort in count "  +k);
        for (int i = 0; i < inputArraySize; i++) {
            System.out.println(inputArray[i]);

    }
}
     static void count(int inputArray[], int k) {
        int[] output = new int[k + 1];
         
        // Find the largest element of the inputArray
        int max = inputArray[0];
        for (int i = 1; i < k; i++) {
            if (inputArray[i] > max)
                max = inputArray[i];
        }
        int[] count = new int[max + 1];
    
        // Initialize count inputArray with all zeros.
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }
    
        // Store the count of each element
        for (int i = 0; i < k; i++) {
            count[inputArray[i]]++;
        }
    
        // Store the cummulative count of each inputArray
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
    
        // Find the index of each element of the original inputArray in count
        // inputArray, and
        // place the elements in output inputArray
        for (int i = k - 1; i >= 0; i--) {
            output[count[inputArray[i]] - 1] = inputArray[i];
            count[inputArray[i]]--;
        }
    
        // Copy the sorted elements into original inputArray
        for (int i = 0; i < k; i++) {
            inputArray[i] = output[i];
    }

}
}
