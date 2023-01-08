/* 1. Write a Java program to print list of repeated words and list of non-repeated words in a given file and 
      print number of repeated words and number of non-repeated words.

     Sample Input: Create text file and write some data to the file.

     Expected Output:
     Repeated words: 
     // Display all words which are repeating
     Number of repeated words: 33
     Non-Repeated Words: 
     // Display all words which are not repeating
     Number of repeated words: 12
*/
import java.io.*;
import java.util.*;
public class RepeatedNonRepeatedWords{

  public static void main(String args[]) throws IOException {
       FileReader fr = new FileReader("Data3.txt");
       BufferedReader br = new BufferedReader(fr);
    ArrayList <String> words = new ArrayList<String>();
       String line;
       while((line=br.readLine())!=null){
         String word[]=line.split(" ");
         for(String st:word){
           words.add(st);
         }
         //System.out.println(words);
       }
      Map<String,Integer> mape = new HashMap<>();
         for(String st1:words){
           if(mape.containsKey(st1)){
             mape.put(st1,mape.get(st1) +1);
           }else{
             mape.put(st1,1);
           }
         }
  System.out.println("Reapeated Words");
    int countr=0;
  for(Map.Entry<String,Integer> e : mape.entrySet()){
    
    if(e.getValue()>1){
      System.out.println(e.getKey());
      countr++;
    }
  }
  System.out.println("Number of repeated words:  "+countr);   
  System.out.println("Non Repeated Words");
    int countnr=0;
  for(Map.Entry<String,Integer> e : mape.entrySet()){
    if(e.getValue()==1){
      System.out.println(e.getKey());
      countnr++;
    }
  }
  System.out.println("Number of repeated words:  "+countnr);
       }
}