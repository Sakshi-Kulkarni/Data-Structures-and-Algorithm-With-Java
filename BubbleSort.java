package DSA;
import java.util.*;

public class BubbleSort {
    private static int k;

    public static void main(String[] args) {
        System.out.println("Enter input Array Size:");
        Scanner sc = new Scanner(System.in);
        int inputArraySize = sc.nextInt();

        int inputArray[] = new int[inputArraySize];
        System.out.println("Enter " + inputArraySize + " Array Elements:");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = sc.nextInt();
        }
        BubbleSort(inputArray, k);
        System.out.println("After Applying Merge sort in count "  +k);
        for (int i = 0; i < inputArraySize; i++) {
            System.out.println(inputArray[i]);
        }
    }

    static void BubbleSort(int inputArray[],int count) {
        boolean flag;
       // int n = inputArray.length;
        int temp = 0;
     count = 0;

        for (int i = 0; i < inputArray.length - 1; i++) {
            flag = false;
            for (int j = 0; j < inputArray.length - i - 1; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                    flag = true;
                }
                k = count++;
            }
            if (flag == false) {
                break;
            }

        }
    }

}