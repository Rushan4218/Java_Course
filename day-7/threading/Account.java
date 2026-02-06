package threading;

public class Account {
  int balance = 1000;

  public void withdraw(int withdrawAmount) {
    synchronized (this) {
      if (withdrawAmount > this.balance) {
        System.out.println("Insufficient balance!");
        return;
      }
      balance -= withdrawAmount;
      System.out.println("Transaction Successful");
      System.out.println("Remaining balance: " + balance);
    }
  }
}
