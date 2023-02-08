/* 1.Write a program to read data from matches.csv file and find out how many 
   times the given team won in a given year using BufferedReader class? 

   Sample Input: 
   Enter Team name: Sunrisers Hyderabad
   Enter Year   : 2017
   Expected Output:  Sunrisers Hyderabad Team won 9 times in 2017
*/

// importing io and util packages
import java.io.*;
import java.util.*;
//creating class ReadCsvFileUsingScanner 
public class ReadCsvFileUsingBufferedReader {

public static void winning(String str,String str1){
  try{
    FileReader fr = new FileReader("match.csv");
    BufferedReader br = new BufferedReader(fr);
    String st=null;
    int count=0;
    while((st=br.readLine())!=null){
      String stv[] = st.split(",");
      if(stv[7].equals(str) && stv[1].equals(str1)){
        count++;
      }
    }
    System.out.println(str+"  Team won "+count+" times in "+str1);
  }
  catch(IOException e){
    System.out.println(e);
  }   
}
   public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
     System.out.println("Enter the Team name");
     String str1 = s.nextLine();
     System.out.println("Enter the year");
     String str2 = s.nextLine();
     winning(str1, str2);
   }
}

//Good
