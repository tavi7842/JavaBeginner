/* 4. Write a program to read data from matches.csv file and find out how many times a given player won
      the man of the match award in a given year?
   Sample Input:
   Enter player Name: Yuvraj Singh
   Enter Year:        2017

   Expected Output: 2 times    
*/
import java.util.*;
import java.io.*;
public class ManOfTheMatchAward {
  public static void mom(String stm,String year){
    try{
        FileReader fr = new FileReader("match.csv");
    BufferedReader br = new BufferedReader(fr);
      
    String str=null;
      int count=0;
    while((str=br.readLine())!=null){
      String str1[] = str.split(",");
      if(str1[10].equals(stm) && str1[1].equals(year)){
           count++;
      }
    }
      System.out.println(count+" times");
    }
    catch(IOException e){
      System.out.println(e);
    }
  }
   public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the player name");
     String st = s.nextLine();
     System.out.println("Enter the year");
     String year = s.nextLine();
      mom(st, year);
     
   }
}
//Good
