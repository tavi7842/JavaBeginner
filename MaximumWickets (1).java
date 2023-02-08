/* 5.Write a program to read data from matches.csv and find out which team had won by maximum wickets.*/
import java.io.*;
import java.util.*;


public class MaximumWickets {

   public static void wickets(){
     try{
     FileReader fr = new FileReader("match.csv");
     BufferedReader br = new BufferedReader(fr);
       Set<String> list = new HashSet<String>();
     String str=null;
     while((str=br.readLine())!=null){
       String str1 []=str.split(",");
       int a = Integer.parseInt(str1[8]);
       if(a==10){
         list.add(str1[7]);
       }
     }
       System.out.println("The no.of teams that won by maimum wickets(10) will be:  "+list.size());
      System.out.println("The list of teams will be:  ");
       System.out.print(list);
       
     }
     catch(IOException e){
       System.out.println(e);
     }
  
   }
   public static void main(String args[]) {
    wickets();
   }
}