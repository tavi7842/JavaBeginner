/* 2. Given an array of n integers. Write an efficient java code using merge sort algorithm to 
      find the sum of  First and last element i. e., smallest and largest elements in the array. 
      also print the sorted array.
      Sample Input:- n=5 , arr=[1,4,2,3,5]
      Expected Output:- Sum is 6
      Smallest Element : 1
      Largest element : 5
*/
import java.util.*;
public class MaxMinSum_Exercise {
  public static void conquer(int arr[],int si,int mid,int ei){
    int merge_arr[]=new int[ei-si+1]; //here we have given like that because indes starts from 0 so we add 1
    int idx1=si;//taking start index for different arrays
    int idx2=mid+1;
    int x=0;
    while(idx1<=mid && idx2<=ei){
      if(arr[idx1]<=arr[idx2]){
        merge_arr[x++]=arr[idx1++];
        // x++;
        // idx1++;
      } else{
        merge_arr[x++]=arr[idx2++];
        // x++;
        // idx2++;
      }
    }
    while(idx1<=mid){
      merge_arr[x++]=arr[idx1++];
        // x++;
        // idx1++;
    }
    while(idx2<=ei){
      merge_arr[x++]=arr[idx2++];
        // x++;
        // idx2++;
    }
    for(int i=0,j=si;i<merge_arr.length;i++,j++){
     
        arr[j]=merge_arr[i];
      
    }
    
  }
  public static void divide(int arr[],int si,int ei){
    if(si>=ei){
      return;
    }
    int mid = si+(ei-si)/2;
    divide(arr,si,mid);
    divide(arr,mid+1,ei);
    conquer(arr,si,mid,ei);
  }
   public static void printArray(int arr[]){
     int sum=0;
     System.out.println("Sorted Array will be  ");
     for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]+" , ");
     }
     System.out.println("");
     sum=arr[0]+arr[(arr.length)-1];
      System.out.println("Sum is "+sum);
     System.out.println("Smallest Element :  "+arr[0]);
     System.out.println("Largest element :"+arr[(arr.length)-1]);
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
     divide(arr,0,n-1);
      printArray(arr);
     
    }
}

