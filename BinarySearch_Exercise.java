/* 1. Write a program to find target element in the given array using binary 
      search technique and check if the target element is prime number or not.

      Sample Input1: A = [23,45,67,78,86,90]
                      Target element is: 67
      Expected Output:  67 is present in 2nd index position and it is prime number

      Sample Input2: A = [23,45,67,78,86,90]
                     Target element is: 86
      Expected Output:  86 is present in 4th index position and it is not a prime number
*/
import java.util.*;
public class BinarySearch_Exercise {
  
  public static void printArray(int arr[],int key){
    int si=0,ei=(arr.length-1);
    int mid = (si+ei)/2;
    int count=0;
   while(si<=ei){
     if(key==arr[mid]){
       for(int i=1;i<=key;i++){
         if(key%i==0){
           count++;
         }
       }
       if(count==2){
          System.out.println(key+"  is present in  "+mid+" index position and its a prime number");
       break;
       }else{
          System.out.println(key+"  is present in  "+mid+" index position and its not a prime number");
         break;
       }
       
      }else if(key<arr[mid]){
        ei=mid-1;
      }else if(key>arr[mid]){
        si=mid+1;
      } 
     mid=(si+ei)/2;
   }
    if(si>ei){
       System.out.println(key+"  is not found");
    }
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
    int key = s.nextInt();
          printArray(arr,key);
        }
}
