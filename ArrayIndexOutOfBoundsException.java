/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException. 
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console. 
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/
import java.util.*;
public class ArrayIndexOutOfBoundsException {

    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n =s.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the"+" "+n+" values of array");
    for(int i=0;i<arr.length;i++){
      arr[i]=s.nextInt();
    }
      // for loop if continued till the last index value if it exceeds the last index it will be given ArrayIndexOutOfBoundsException
      try{
        for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]+" ");
      }
      }
        catch(Exception e){
        System.out.println(e);
    }
    }
}

