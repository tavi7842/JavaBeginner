/* 5. Write a program a program to count the occurrence of each element in the array.
Expected Output:
---------------------------------------
 Element | Frequency
 ---------------------------------------
 1 | 2
 8 | 2
 3 | 2
 2 | 1
 5 | 3
 7 | 1
 9 | 1
 ----------------------------------------  
*/
import java.util.*;
public class Frequency {
  public static void frequency(int arr[]){
  HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

    for(int i=0;i<arr.length;i++){
      if(map.containsKey(arr[i])){
        map.put(arr[i],map.get(arr[i])+1);
      } else{
        map.put(arr[i],1);
      }
    }
    System.out.println("Element | Frequency");
  for(Map.Entry<Integer,Integer> entry: map.entrySet()){
    System.out.println(entry.getKey()+"|"+entry.getValue());
  }
  }
	public static void main(String args[]) {
    int arr[]={10,10,20,30,20,5,5};
    frequency(arr);
    
      
        }
}