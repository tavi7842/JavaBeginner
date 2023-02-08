/* 3. Write a program to find second highest value and second least value in the given array values. 
   Sample Input: array[]= {5, 10, 20, 15, 50}
   
   Expected Output: 
   Second highest value: 20
   Second least value: 15
*/

public class SecondHighestAndLeastValue {
  static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
          for (int j = 0; j < n - i - 1; j++){
          if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
        }                   
    }
  static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
    System.out.println("Second highest value:  "+arr[arr.length-2]);
    System.out.println("Second least value:  "+arr[2]);
    
  }
	public static void main(String args[]) {
          int arr[]={5, 10, 20, 15, 50};
    bubbleSort(arr);
    printArray(arr);
        }
}