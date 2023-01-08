/* 4. Write a Java program to read data from input file and find word count in each line and longest word in each line. 
      Handle IOException while reading data from input file.

     Sample Input: Create text file and write some data to the file.
     Expected Output:
     Number of words in line number1: 4 and longest word is: "     “ (Print longest word in first line)
     '
     '
     '
     Number of words in line number n: 7 and longest word is: "    “ (Print longest word in last line)
*/
import java.io.*;
public class LongestWordInEachLine {

    public static void main(String args[]) throws IOException {
     FileReader fr = new FileReader("Data2.txt");
    BufferedReader br = new BufferedReader(fr);
      String str="";
      String longest="";
      int line_number=0,wcount=0,max=0;
      while((str=br.readLine())!=null){
        line_number++;
        wcount=0;
        max=0;
        longest="";
        String words[]=str.split(" ");
        wcount=words.length; 
        for(int i=0;i<words.length;i++){
          if(words[i].length()>max){
            max=words[i].length();
            longest=words[i];
          }  
        }
       System.out.println("Number of words in line number"+line_number+": "+wcount+"  and longest word is: "+longest);
      }
    }
}

