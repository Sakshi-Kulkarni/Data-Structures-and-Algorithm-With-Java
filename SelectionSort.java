import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Enter input Array Size:");
			 Scanner sc= new Scanner(System.in);
			int inputArraySize =sc.nextInt();
			
			int inputArray[] = new int[inputArraySize];
			System.out.println("Enter " +inputArraySize+" Array Elements:");
			for (int i = 0; i < inputArray.length; i++) {
				inputArray[i]  =sc.nextInt();
			}
             selectionSort(inputArray);
            System.out.println("After Applying Insertion sort");
            for (int i = 0; i < inputArraySize; i++) {
                System.out.println(inputArray[i]);
            }
    }

    static void selectionSort(int inputArray[] ){  
        for (int i = 0; i < inputArray.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < inputArray.length; j++){  
                if (inputArray[j] < inputArray[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = inputArray[index];   
            inputArray[index] = inputArray[i];  
            inputArray[i] = smallerNumber;  
        }  
    }  
       
}
