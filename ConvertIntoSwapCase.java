/* 3. Write a Java program to read data from input file and convert all the characters into swap case then 
      write into output file using FileInputStream and FileOutputStream classes.

      Sample Input: Create text file and write some data to the file. 
      Sample Data: "Hi, This is Sample data"
      Expected Output: hI,tHIS IS sAMPLE DATA

*/
import java.io.*;
public class ConvertIntoSwapCase {

    public static void main(String args[]) throws IOException {
     FileInputStream fis = new FileInputStream("Sample.txt");
     int ch=0;
      String str="";
      String str1="";
      while((ch=fis.read())!=-1){
        str=str+(char)ch;
       
      }
       System.out.println(str);
      String arr[] = str.split("");
      for(int i=0;i<arr.length;i++){
        char a[] = arr[i].toCharArray();
        for(int j=0;j<a.length;j++){
          if(Character.isUpperCase(a[j])){
            char b = Character.toLowerCase(a[j]);
             str1=str1+b; 
        } else{
            char b = Character.toUpperCase(a[j]);
             str1=str1+b; 
        }
        }
      }
      System.out.println(str1);
      FileOutputStream fos = new FileOutputStream("Sample_Converted.txt");
      char c[] = str1.toCharArray();
      for(int i=0;i<c.length;i++){
        fos.write(c[i]);
        
      }
      fos.close();
    }
}
