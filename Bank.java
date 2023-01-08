/* 3. Write a program to create 2 threads by extending from Thread class and create synchronized method called 
      withdraw(int amt) and access withdraw( ) from Thread1 and Thread 2.   */




class Withdrawn{
   int balance = 50000;
  synchronized  void withdraw(int amt){
    balance = balance-amt;
   System.out.println("Withdraw Successfull and current balance will be:  "+balance);
  }
}



class Thread1 extends Thread{
  Withdrawn w;
  Thread1(Withdrawn w){
    this.w=w;
  }
  public void run(){
    w.withdraw(5000);
  }
}
class Thread2 extends Thread{
  Withdrawn w;
  Thread2(Withdrawn w){
    this.w=w;
  }
  public void run(){
    w.withdraw(5000);
  }
}


public class Bank {
    public static void main(String args[]){
      Withdrawn wt = new Withdrawn();
      Thread1 t1 = new Thread1(wt);
      Thread2 t2 = new Thread2(wt);
      t1.start();
      t2.start();
        
        
    }
}
