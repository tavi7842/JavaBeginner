/* 3. Write a Java program to find the longest word and smallest word in a text file.

    Sample Input: Create text file and write some data to the file. 
    Sample Data: "Welcome to bitLabs"

    Expected Output: 
    Longest word: Welcome
    Smallest word: to
*/
import java.io.*;
public class FindingLongestSmallestWord {

    public static void main(String args[]) throws IOException{
      FileReader fr = new FileReader("Data1.txt");
      BufferedReader br = new BufferedReader(fr);
      
      String str;
      while((str=br.readLine())!=null){
        String str1[]=str.split(" ");
        int longest=str1[0].length(),smallest=str1[0].length();
        String longWord=str1[0],smallWord=str1[0];
        for(int i=1;i<str1.length;i++){
          if(str1[i].length()>longest){
            longest=str1[i].length();
            System.out.println(str1[i]);
            longWord=str1[i];
          }else if(str1[i].length()<smallest) {
            smallest=str1[i].length();
            smallWord=str1[i];
          }
        }
        System.out.println("Longest word:  "+longWord);
         System.out.println("Smallest word:  "+smallWord);
      }
       
    }
}
