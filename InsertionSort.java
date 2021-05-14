import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {
        System.out.println("Enter input Array Size:");
			 Scanner sc= new Scanner(System.in);
			int inputArraySize =sc.nextInt();
			
			int inputArray[] = new int[inputArraySize];
			System.out.println("Enter " +inputArraySize+" Array Elements:");
			for (int i = 0; i < inputArray.length; i++) {
				inputArray[i]  =sc.nextInt();
			}
            insertionSort(inputArray);
            System.out.println("After Applying Insertion sort");
            for (int i = 0; i < inputArraySize; i++) {
                System.out.println(inputArray[i]);
            }
    }
    static void insertionSort(int inputArray[]) {  
        int n = inputArray.length;  
        for (int j = 1; j < n; j++) {  
            int key = inputArray[j];  
            int i = j-1;  
            while ( (i > -1) && ( inputArray [i] > key ) ) {  
                inputArray [i+1] = inputArray [i];  
                i--;  
            }  
            inputArray[i+1] = key;  
        }  
    }  
}