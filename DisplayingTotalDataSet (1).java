/*3.Write a program to read data from matches.csv file and find out following points:
   • how many matches we have got in this dataset.
   • how many Seasons(years) we have got in this dataset.
   • how many venues we have got in this dataset.

   Expected Output:
   Number of matches: 750
   Number of seasons: 5
   Number of venues: 9
*/
import java.util.*;
import java.io.*;

public class DisplayingTotalDataSet {
  
  public static void venue(){
    try{
        FileReader fr = new FileReader("match.csv");
    BufferedReader br = new BufferedReader(fr);
      HashSet<String> set = new HashSet<String>();
      
    String str=null;
    while((str=br.readLine())!=null){
      String str1[] = str.split(",");
      String a =str1[11];
      set.add(a);
    }
    System.out.println(" Number of venues:  "+set.size());
      //System.out.println(set);
    }
    catch(IOException e){
      System.out.println(e);
    }
  }
  
  public static void seasons(){
    try{
        FileReader fr = new FileReader("match.csv");
    BufferedReader br = new BufferedReader(fr);
      HashSet<String> set = new HashSet<String>();
      
    String str=null;
    while((str=br.readLine())!=null){
      String str1[] = str.split(",");
      String a =str1[1];
      set.add(a);
    }
    System.out.println(" Number of seasons:  "+set.size());
      //System.out.println(set);
    }
    catch(IOException e){
      System.out.println(e);
    }
  }

  public static void matches(){
    int count=0;
    try{
        FileReader fr = new FileReader("match.csv");
    BufferedReader br = new BufferedReader(fr);
    String str=null;
    while((str=br.readLine())!=null){
      count++;
    }
    System.out.println(" Number of matches: "+count);
    }
    catch(IOException e){
      System.out.println(e);
    }
  }
   public static void main(String args[]) {
     matches();
     venue();
     seasons();
   }
}

//Good
