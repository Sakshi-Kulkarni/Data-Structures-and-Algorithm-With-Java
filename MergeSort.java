import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
    System.out.println("Enter input Array Size:");
			 Scanner sc= new Scanner(System.in);
			int inputArraySize =sc.nextInt();
			
			int inputArray[] = new int[inputArraySize];
			System.out.println("Enter " +inputArraySize+" Array Elements:");
			for (int i = 0; i < inputArray.length; i++) {
				inputArray[i]  =sc.nextInt();
			}
            mergesort(inputArray, 0, inputArraySize-1); 
            System.out.println("After Applying Merge sort");
        for (int i = 0; i < inputArraySize; i++) {
            System.out.println(inputArray[i]);
        }

}
 static void mergesort(int inputArray[],int Start,int end){
    int mid;
    if(Start<end){
        mid=(Start+end)/2;
        mergesort(inputArray, Start, mid);
        mergesort(inputArray, mid+1, end);
        merge(inputArray, Start, mid, end);;
    }
}
static void merge(int inputArray[], int start, int mid, int end) {

	// create a temp array
	int temp[] = new int[end - start + 1];

	// crawlers for both intervals and for temp
	int i = start, j = mid+1, k = 0;

	// traverse both arrays and in each iteration add smaller of both elements in temp 
	while(i <= mid && j <= end) {
		if(inputArray[i] <= inputArray[j]) {
			temp[k] = inputArray[i];
			k += 1; i += 1;
		}
		else {
			temp[k] = inputArray[j];
			k += 1; j += 1;
		}
	}

	// add elements Start in the first interval 
	while(i <= mid) {
		temp[k] = inputArray[i];
		k += 1; i += 1;
	}

	// add elements Start in the second interval 
	while(j <= end) {
		temp[k] = inputArray[j];
		k += 1; j += 1;
	}

	// copy temp to original interval
	for(i = start; i <= end; i += 1) {
		inputArray[i] = temp[i - start];
	}
}


}
