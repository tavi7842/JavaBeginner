/* 4. Write a program to print the array elements after each iteration of the outer loop.  
      Use insertion sort to sort the given values.

      Sample Input:-  n = 3 , arr =[5,2,1]
      Expected Output:- 
      The array elements after 1st iteration of the outer loop
      2
      5
      1
      The array elements after 2nd iteration of the outer loop
      1
      2
      5
*/
import java.util.*;
public class StepInsertion_Exercise {
  static int count =1;
  public static void sort(int arr[]){
    for(int j=1;j<arr.length;j++){
      int key = arr[j];
      int i = j-1;
      while( i >= 0 && arr[i] > key){
        arr[i+1] = arr[i];
        i--;  
      }
     arr[i+1]=key;
    printArray(arr);
    }
  }
  public static void printArray(int arr[]){
    System.out.println("The array elements after  "+count+" iteration of the outer loop");
    count++;
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the size of array");
      int n = s.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the "+n+" values in the array");
      for(int i=0;i<arr.length;i++){
        arr[i]=s.nextInt();
      }
      sort(arr);
    }
}




