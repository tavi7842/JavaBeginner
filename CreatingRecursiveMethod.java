/* 2. Write a program to create a recursive method to check the given target value is present 
      in array or not using binary search technique. If target exists, then return its index. 
      Otherwise, return -1. 

      Sample Input1: array = [-1,0,3,5,9,12], target = 9
      Expected Output: 9 exists in array and its index is 4
 
      Sample_Input2: array = [-1,0,3,5,9,12], target = 2
      Expected Output: 2 does not exist in array 
*/
import java.util.*;
public class CreatingRecursiveMethod {
 public static int printResult(int arr[],int target){
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
     int value = printResult(arr,target);
    if(value==-1){
      System.out.println(target+" does not exist in array"); 
    }else{
      System.out.println(target+" exists in array and its index is "+value);
    }
 }
}
