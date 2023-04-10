public class SavingsAccount {
    //Instance Fields 
    int balance;
    //Constructor method 
    public SavingsAccount(int initialBalance){
      balance = initialBalance;
    }
  
    //Method that print out the balance of the SavingsAccount
    public void checkBalance(){
      System.out.println("Hello!");
      System.out.println("Your balance is " + balance);
    }
    
    //Deposits money into SavingsAccount, updates the balance and prints out the amount that was deposited 
    public void deposit(int amountToDeposit){
      balance += amountToDeposit;
      System.out.println("You just deposited $" + amountToDeposit);
    }
  
    //Withdraw mehtod that updates the balance and returns the withdrawl amount
    public int withdraw(int amountToWithdraw){
        balance -= amountToWithdraw;
        System.out.println("You just withdrew $" + amountToWithdraw);
        return amountToWithdraw;
    }
    //Main Method  
    public static void main(String[] args){
      //Instance of class SavingsAccount 
      SavingsAccount savings = new SavingsAccount(2000);
      
      //Testing created methods 
      savings.deposit(500);
      savings.withdraw(2000);
      savings.checkBalance();
     
      
    }       
  }
  