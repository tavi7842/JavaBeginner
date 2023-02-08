/* 5. Write a program to sort an array using Quick sort algorithm and accept X value from user and 
      print all the elements in the array whose values are greater than X.
      Sample Input:- n=5 , arr=[1,4,2,3,5],  x=2
      Expected Output:- number of elements greater than x is 3
      Elements are: 3, 4, 5
*/
import java.util.*;
public class LargerElements_Exercise {
  public static int partition(int arr[],int low,int high){
    int pivot = arr[high];
    int i = -1;
    int temp=0;
    for(int j=0;j<arr.length;j++){
      if(arr[j]<pivot){
        i++;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
      }
    }
    temp=arr[i+1];
   arr[i+1]=arr[high];
    arr[high]=temp;
    return i+1; //returning the pivot value to quick sort method
  }

public static void sort(int arr[],int low,int high){
    if(low<high){
    int piindex = partition(arr,low,high);
      sort(arr,low,piindex-1);
      sort(arr,piindex+1,high);
  }
}
    public static void printArray(int arr[],int x){
      int count=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>x){   
        count++;
      }
    }
  System.out.println("number of elements greater than x is : "+count);
      System.out.print("Elements are:   ");
      for(int i=0;i<arr.length;i++){
      if(arr[i]>x){
         System.out.print(arr[i]+" , ");
      }
    }
    }
    public static void main(String args[]) {
    LargerElements_Exercise le = new LargerElements_Exercise();
      Scanner s = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = s.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the "+n+" values of array");
    for(int i=0;i<arr.length;i++){
      arr[i]=s.nextInt();
    }
     System.out.println("Enter the value of x");
      int x=s.nextInt();
      sort(arr,0,n-1);
      System.out.println("Sorted Array will be: ");
      printArray(arr,x);
    }
}
