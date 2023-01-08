/* 4. Write a program to create two Threads by extending from Thread class. And create two file like abc.txt file and xyz.txt file.
    • Thread1 should read data from abc.txt then it should read data from xyz.txt file and display on console.  
    • Thread2 should read data from xyz.txt then it should read data from abc.txt file and display on console.
    Create two synchronized blocks to achieve dead lock.  
*/
import java.io.*;
class Thread12 extends Thread{
   public void run(){
    synchronized("abc.txt") {
      try{
        FileReader fr = new FileReader("abc.txt");
        BufferedReader br = new BufferedReader(fr);
        String word;
        while((word=br.readLine())!=null){
          System.out.println(word);
         
        }
      //Thread.sleep(1000);
       br.close();
        fr.close();
      }
      catch(Exception e){
        System.out.println(e);
      }
       synchronized("xyz.txt") {
      try{
        FileReader fr1 = new FileReader("xyz.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        String word;
        while((word=br1.readLine())!=null){
          
          System.out.println(word);
        }
        br1.close();
        fr1.close();
      }
      catch(Exception e){
        System.out.println(e);
      }
      
    }
    }
    
  }
}
class Thread21 extends Thread{
  File obj1 = new File("abc.txt");
   File obj2 = new File("xyz.txt");
   public void run(){
    synchronized("xyz.txt") {
      try{
        FileReader fr = new FileReader("xyz.txt");
        BufferedReader br = new BufferedReader(fr);
        String word;
        while((word=br.readLine())!=null){
           
          System.out.println(word);
        }
        br.close();
        fr.close();
       // Thread.sleep(1000);
      }
      catch(Exception e){
        System.out.println(e);
      }
       synchronized("abc.txt") {
      try{
        FileReader fr1 = new FileReader("abc.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        String word;
        while((word=br1.readLine())!=null){
           
          System.out.println(word);
        }
        br1.close();
        fr1.close();
     }
      catch(Exception e){
       System.out.println(e);
      }
      
    }
    }
    
  }
}
public class DeadLock  {

	public static void main (String args[])  throws Exception{
    Thread12 t1 = new Thread12();
    Thread21 t2 = new Thread21();
    t1.start();
    t2.start();
	}
}

