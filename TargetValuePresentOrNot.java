/* 4. Write a program to sort given array and accept integer value [target value] from user and check 
      the target value is present in the given array or not using binary search technique. 
      If target exists, then return its index. Otherwise, return -1. 
      Sample Input1: array = [-1,0,3,5,9,12], target = 9
      Expected Output: 9 exists in array and its index is 4

      Sample Input: array = [-1,0,3,5,9,12], target = 2
      Expected Output: Explanation: 2 does not exist in array
*/ 
import java.util.*;
public class TargetValuePresentOrNot {
  public static void sort(int arr[]){
    int n=arr.length,temp=0;
    for(int i=0;i<(n-1);i++){
      for(int j=0;j<(n-1-i);j++){
        if(arr[j]>arr[j+1]){
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }
  public static int result(int arr[],int target){
   int si=0,ei=(arr.length-1);
   int mid = (si+ei)/2;
  
   while(si<=ei){
     if(arr[mid]==target){  
      return mid;
      
     }else if(target>mid){
       si=mid+1;
     }else{
       ei=mid-1;
     }
     mid=(si+ei)/2;
   }
     return -1;
 }
  static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" , ");
    }
    System.out.println(" ");
  }

	public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = s.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+ n +" values of the array");
     for(int i=0;i<n;i++){
       arr[i]=s.nextInt();
     }
    System.out.println("Enter the value to be searched");
    int target = s.nextInt();
     int value = result(arr,target);
    if(value==-1){
      System.out.println(target+" does not exist in array"); 
    }else{
      System.out.println(target+" exists in array and its index is "+value);
    }
    sort(arr);
    System.out.println("Array after Sorting");
    printArray(arr);
    result(arr, target);
    
      
        }
}