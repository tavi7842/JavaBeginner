/* 2. Write a program to create custom exception to perform deposit and withdraw options. 
      Create InvalidAmountException and throw this exception whenever user trying to deposit or withdraw invalid amount. 
      Deposit and withdraw amount should be multiples of 100 and it should be positive value.
*/
import java.util.*;
import java.io.*;
class InvalidAmountException extends Exception{
  public InvalidAmountException(String str){
    super(str);
  }
}
public class CustomException {
  static int balance = 50000;
  
  public static void validateDepositAmount(int amountd) throws InvalidAmountException{
    if(amountd%100==0 && amountd>0){
      balance=amountd+balance;
      System.out.println("Money Deposited and balance will be :  "+balance);
    } else{
      throw new InvalidAmountException("Amount should be Entered in multiples of 100");
    }
  }
  public static void validateWithdrawAmount(int amountw) throws InvalidAmountException{
    if(amountw%100==0 && amountw>0){
      balance=balance-amountw;
      System.out.println("Money Withdrawn and balance will be :  "+balance);
    } else{
      throw new InvalidAmountException("Amount should be Entered in multiples of 100");
    }
  }
    public static void main(String args[]) {
      //CustomException ce = new CustomException();
      char ch=0;
      do{
      System.out.println("1.Deposit");
      System.out.println("2.Withdraw");
      System.out.println("Choose your option");
      Scanner sc = new Scanner(System.in);
      int option = sc.nextInt();
        switch(option){
        case 1:
          Scanner s = new Scanner(System.in);
          System.out.println("Enter the amount in multiples of 100");
          int amt = s.nextInt();
          try{
            validateDepositAmount(amt);
          }
          catch(InvalidAmountException e){
            System.out.println(e.getMessage());
          }
          break;
          case 2:
          Scanner st = new Scanner(System.in);
          System.out.println("Enter the amount in multiples of 100");
          int amtw = st.nextInt();
          try{
            validateWithdrawAmount(amtw);
          }
          catch(InvalidAmountException e){
            System.out.println(e.getMessage());
          }
          break;
      }
        Scanner sb = new Scanner(System.in);
        System.out.println("Do want to go to options(y/n)");
        ch = sb.next().charAt(0);
      }while(ch=='y');
      System.out.println("Thank you");
    }
}
