/* 2. Write a program to create a Thread by extending from Thread class. Override run() method and in run() 
      method accept number of seconds from user and display countdown time. 
      
      Sample Input: 
      Enter Number of seconds: 60

      Expected Output:
      59 seconds to go..
      58 seconds to go..
      57 seconds to go..
      56 seconds to go..
*/
import java.util.*;
class ThreadSample extends Thread{
  public void run(){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Number of seconds:  ");
    int n = s.nextInt();
    for(int i=n;i>0;i--){
      System.out.println(i+"  Seconds to go...");
    }
  }
}
public class OverrideThread  {

	public static void main(String args[]) {
	  ThreadSample ts = new ThreadSample();
    ts.start();
	}
}

