//no.of macthes in particuar city
//maxvalue of win range
//min value of win range
//how many time got toss as feild and bating particular team

import java.io.*;
import java.util.*;
class LargeDataIpl{
  static void match(String str)throws IOException{
    FileReader fr = new FileReader("Match.csv");
   BufferedReader br = new BufferedReader(fr);
    String str1 = null;
    int count=0;
    while((str1=br.readLine())!=null){
       String str3[]=str1.split(",");
      for(int i=0;i<str3.length;i++){
        if(str3[i].equals(str)){
          count++;
        }
      }
    }
    System.out.println(count);
  }
  public static void main(String args[])throws IOException{
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the city name");
    String city = s.next();
    match(city);
    
  }
}