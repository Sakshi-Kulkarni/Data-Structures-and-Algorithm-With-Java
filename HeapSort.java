package DSA;
import java.util.*;
public class HeapSort {
    public static void main(String[] args) {
        System.out.println("Enter input Array Size:");
                 Scanner sc= new Scanner(System.in);
                int inputArraySize =sc.nextInt();
                
                int inputArray[] = new int[inputArraySize];
                System.out.println("Enter " +inputArraySize+" Array Elements:");
                for (int i = 0; i < inputArray.length; i++) {
                    inputArray[i]  =sc.nextInt();
                }
                sort(inputArray);
                  System.out.println("After Applying Heap sort");
            for (int i = 0; i < inputArraySize; i++) {
                System.out.println(inputArray[i]);
            }
    
    }
    static void sort(int inputArray[])
    {
        int n = inputArray.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(inputArray, n, i);
 
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = inputArray[0];
            inputArray[0] = inputArray[i];
            inputArray[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(inputArray, i, 0);
                }
            }
    static void heapify(int inputArray[], int inputArraySize, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        while (l < inputArraySize && inputArray[l] > inputArray[largest])
            {
                largest = l;
            }
 
        // If right child is larger than largest so far
        while (r < inputArraySize && inputArray[r] > inputArray[largest])
            {
                largest = r;
            }
 
        // If largest is not root
        if (largest != i) {
            int swap = inputArray[i];
            inputArray[i] = inputArray[largest];
            inputArray[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(inputArray, inputArraySize, largest);
        }
    }
}
