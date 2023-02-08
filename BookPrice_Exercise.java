/* 3. Given the price of n books, find the sum of the price of the Costliest k books. 
      The price of books is given in the form of an array. Use bubble sort algorithm for sorting. 
      Note that k is always less than n.
      Sample Input:-  n = 5 , arr =[3, 14, 54, 21, 41], k=2
      Expected Output:- The sum of k costliest book which can be brought is 95
*/
import java.util.*;
public class BookPrice_Exercise {
  public void Calucalate(int n,int arr[],int k){
    
    int temp=0,i=0,price=0;
    for( i=1;i<(arr.length-1);i++){ 
      
        if(arr[i]<arr[i-1]){ 
          temp=arr[i-1]; 
          arr[i-1]=arr[i];
          arr[i]=temp;
        
      }
    }
    if(k<n){
      price=arr[n-1]+arr[n-2];
      System.out.println("The sum of "+k+"  costliest book which can be brought is  "+price);
    } else{
      System.out.println("Enter the valid number for sum of costliest books");
    }
    
  }

    public static void main(String args[]) {
      BookPrice_Exercise bp = new BookPrice_Exercise();
      Scanner s = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = s.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the "+n+" values of array");
    for(int i=0;i<arr.length;i++){
      arr[i]=s.nextInt();
    }
     System.out.println("Enter the number for sum of costliest books");
      int k=s.nextInt();
      bp.Calucalate(n,arr,k);

    }
}
