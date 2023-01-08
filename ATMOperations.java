/* 2. Write a program to perform ATM operations such as deposit, withdraw and balance enquiry. Display list of options for user selection. 
   Accept option from the user and execute specified method. throw Exception when user trying to withdraw amount more than 3 times.
*/
import java.io.IOException;
import java.util.*;
public class ATMOperations {
  double balance=50000;
  int countw=0;
      double deposit=0,withdraw=0,balance_enquiry=0;
  public void deposit(double deposit){
          balance = balance+deposit;
          System.out.println("amount deposited");
  }
  public void withdrawn(double withdraw) throws IOException{
    if(countw<3){
      balance = balance-withdraw;
      countw++;  
      System.out.println("amount withdrawn  "+countw+" time");
    }else{
      throw new IOException("Withdrawn limit Exceeded");
    }
  }
  public void balanceEnquiry(){
    System.out.println("The remaining balance will be"+" "+balance);
  }
    public static void main(String args[]) {   
      char ch=0;
      ATMOperations op = new ATMOperations();
      Scanner s = new Scanner(System.in);
     do{
      System.out.println("1.Deposit");
      System.out.println("2.Withdraw");
      System.out.println("3.Balance Enqiury");
      System.out.println("Enter your option");
       
      int option = s.nextInt();
        switch(option){
        case 1:
          System.out.println("Enter the amount to be deposited");
          double deposit_amount =s.nextDouble();
          op.deposit(deposit_amount);
          break;
        case 2:
          System.out.println("Enter the amount to be withdrawn");
          double withdraw_amount = s.nextDouble();
            try{
              op.withdrawn(withdraw_amount);
            }
            catch(IOException e){
              System.out.println(e.getMessage());
            }
          break;
        case 3:
          op.balanceEnquiry();
          break;
      } 
        System.out.println("Do you want to go options(y/n)");
         ch = s.next().charAt(0);
      }while (ch=='y');
      System.out.println("Thank you visit again");
    }
}