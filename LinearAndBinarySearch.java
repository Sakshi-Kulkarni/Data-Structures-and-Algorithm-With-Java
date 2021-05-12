import java.util.Scanner;
import java.util.Arrays;
public class LinearAndBinarySearch {
     public static void main(String[] argsa) {
        Scanner sc=new Scanner(System.in);
        int search;
        long start = System.currentTimeMillis();
        System.out.println("Enter input Array Size:");
			int inputArraySize =sc.nextInt();
			int index;
			int inputArray[] = new int [inputArraySize];
			System.out.println("Enter " +inputArraySize+" Array Elements:");
			for (index = 0; index < inputArray.length; index++) {
				inputArray[index]  =sc.nextInt();
			}
            System.out.println("Enter Your choice:\n\t1.Linear Search\n 2.Binary with Itrative method\n 3.Binary with Recursive Method");

            int key = sc.nextInt();
           switch (key) {
               //Linear search
              case 1:
                       System.out.println("Enter value to find:");
                         search=sc.nextInt();
                                for (index = 0; index < inputArray.length; index++){
                                  if (inputArray[index]==search) {
                                        System.out.println("\tIs present at location:"+(index)+".");
                                             break; 
                                               }
                                           }
                                if(index==inputArray.length){
                                    System.out.println(search + " Not present in inputArray.");
                                     }
                                       break;
                                        

  //Binary search with Itrative Method
  case 2:
  Arrays.sort(inputArray);
      System.out.printf("This is sorted array : %s\n",Arrays.toString(inputArray));
  System.out.println("Enter Seach Key Element:");
  int Element =sc.nextInt();
  int Low=0;
  int High=inputArray.length-1;
  ItrativeBinarySearch(inputArray, 0, inputArray.length-1, Element);
  int found_index = ItrativeBinarySearch(inputArray,Low,High,Element);
  if(found_index == -1 ) {
     System.out.println("Element not found in the array ");
  }
  else {
     System.out.println("Element found at index : "+found_index);
  }
  break;

  //Binary search with Recursive Method
  case 3:
  int low=0;
  int high=inputArray.length-1;
  Arrays.sort(inputArray);
  System.out.printf("Sorted Array : %s\n",Arrays.toString(inputArray));
  System.out.println("Enter Seach Key Element:");
  int element =sc.nextInt();
  int seachKeyIndex = binarySearch(inputArray,0,inputArray.length-1,element);
  if( seachKeyIndex != -1)
      System.out.println(element +" found at index: "+seachKeyIndex);
  else
      System.out.println(element +" not found in inputArray");

  binarySearch(inputArray, low, high, element);
  break;
  default:
    System.out.println("Invalid input");
} 
long end = System.currentTimeMillis();
      //finding the time difference and converting it into seconds
      float sec = (end - start) / 1000F; System.out.println( " Time Requires for Execution in seconds"+sec );         
    }


    public static int ItrativeBinarySearch(int[] inputArray,int Low,int High, int Element){
        while (Low <= High){
            int middle = Low + (High- Low )/2;
            if (inputArray[middle] == Element)
               return middle;
            if (inputArray[middle] < Element)
               Low = middle + 1;
            else
               High = middle - 1;
         }
         return -1;
    }


    public static int binarySearch(int[] inputArray,int low,int high, int element) {
		
		if(low <= high) {
			int middleIndex = (low+high)/2;
			
			if(inputArray[middleIndex] == element)
				return middleIndex;
			else if(element < inputArray[middleIndex])
				return binarySearch(inputArray,low,middleIndex-1,element);
			else
				return binarySearch(inputArray,middleIndex+1,high,element);
		}
		return -1;
	}
    
}
