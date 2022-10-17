/*
 * Lab 12
 * Wayne Chaney
 * CSE 174 I
 * Teacher: Meisam Amjad
 * 
 * A lab in which you analyze the performance of
 * Bubble Sort and Binary Search
 *
 */
import java.util.Random;

public class SortSearchLab {
  public static void main(String[] args) {
    
    // Creates an array of of 5 elements with
    // values ranging from 0 to 49:
    int[] data = randomArray(100000, 1000);//integers
    bubbleSort(data);//printing bubble data
    System.out.println(binarySearch(3304,data));//priting binary seach 
    
    
    
    // for (int n : data) System.out.print(n + " ");
    // System.out.println();
    
  }
  
  // Sorting methods have a return type of void,
  // typically.  That's because the method has
  // access to the original array and can directly modify
  // it.  In other words, it does not need to create
  // and return a new array.  It just changes the existing array.
  public static void bubbleSort(int[] data) {
    int temp = 0; int swaps = 0; int passes= 0;int compare = 0;// intinalizing the integers
    for(int j =0; j < data.length-1; j++){
      passes++;//counts how many times loop has occured
      for(int i =0; i < data.length-1; i++){
        compare++;//if loop has gone through that add one to the comparising
        if(data[i] > data[i+1]){
          temp = data[i];
          data[i] = data[i+1];
          data[i+1]=temp;
          swaps++;//swap count if swapp occuered
          
        }
      }
      
    }
    System.out.println(passes);//print statements
    
    System.out.println(compare);//print statements
    System.out.println(swaps);//print statements
    
    
  }
  
  /**
   * Linear search method
   * Worst case scenario takes O(n) big o of n time
   * to find the key
   * @param int key
   * @param int[] array
   * @return int index of key, or -1
   */
  public static int linearSearch(int key, int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (key == array[i]) {
        System.out.printf("Number of values checked" +
                          "in Linear Search: %d\n", (i+1));
        return i;
      }
    }
    
    return -1;
  } 
  public static int binarySearch( int key, int[] array){//binary seach method
    int low = 0;int count =0;//intalize
    int high = array.length - 1;
    while(high >= low) {
      int middle = (low + high) / 2;
         count++;//need it before the end
      if
        (array[middle] == key) {
        System.out.println(count);
        return middle;  //
      } 
      else if
        (array[middle] < key) {
        low = middle + 1;//split low
      } 
      else if
        (array[middle] > key) {
        high = middle - 1;//split high
      }
   
    }
    System.out.println(count);
    return -1;//if not the array
  }
  
  // Returns an array of random int values ranging
  // from 0 to (max-1).  Don't change any of this
  // code.  142857 is a "seed".  It guarantees that the
  // stream of random numbers will be the same
  // each time the method is called.
  public static int[] randomArray(int max, int size) {//random array method
    Random rnd = new Random(142857);
    
    int[] result = new int[size];
    
    for (int i = 0; i < size; result[i++] = rnd.nextInt(max));
    
    return result;
  }
  
  
}