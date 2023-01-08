/* 2. Write a Java program to read data from input file and convert into uppercase then write data into 
      output file using FileInputStream and FileOutputStream classes. Handle IOException while reading and writing data.

      Sample Input:Create text file and write some data to the file.
      Sample Data: "Hi, this is Sample data"

      Expected Output: HI, THIS IS SAMPLE DATA
*/
 import java.io.*;
public class ConvertIntoUpperCase {

    public static void main(String args[]) throws IOException {
      FileInputStream fis = new FileInputStream("Sample.txt");
      int ch=0;
      String str="";
      String str1="";
      while((ch=fis.read())!=-1){
        str=str+(char)ch;
      }
      System.out.println(str);
      String word[]=str.split("");
      for(int i=0;i<word.length;i++){
        char c[] = word[i].toCharArray();
        for(int j=0;j<c.length;j++){
          if(Character.isLowerCase(c[j])){
            char a = Character.toUpperCase(c[j]);
            str1=str1+a;
          }else{
            str1=str1+c[j];
          }
        }
      }
      System.out.println(str1);
      FileOutputStream fos = new FileOutputStream("Sample_Uppercase.txt");
      char c[] = str1.toCharArray();
      for(int i=0;i<c.length;i++){
        fos.write(c[i]);
      }
    }
}


