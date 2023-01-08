/* 2. Write a program to read data from a file and find the frequency of each word in a file. 
      And print each word along with frequency in sorted order.

   Sample Input: Create text file and write some data to the file.
   Expected Output:

      word 1: top frequency
            :
            :
            :
      Word n:  least frequency
*/

import java.io.*;
class FindingFrequency{
  public static void main(String[]args) throws IOException{
    FileReader fr=new FileReader("Data.txt");
    BufferedReader br=new BufferedReader(fr);
    String str;
    int count=0;
    while((str=br.readLine())!=null){
       System.out.println(str);
      String arr[]=str.split(" ");
      int fre[]=new int[arr.length];
      for(int i=0;i<arr.length;i++){
        count=1;
        for(int j=i+1;j<arr.length;j++){
          if(arr[i].equals(arr[j])){
            count++;
            fre[j]=-1;
          }
          
        }
        if(fre[i]!=-1){
         fre[i]=count; 
        }
                
      }
      for(int i=0;i<arr.length;i++){
        if(fre[i]!=-1){
          System.out.println(fre[i]+" "+arr[i]);
        }
      }
      
    }
  }
}


