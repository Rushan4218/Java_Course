package threading;

public class ThreadOne extends Thread {

  Account account;

  public ThreadOne(Account account) {
    this.account = account;
  }

  public void run() {
    account.withdraw(500);
  }
}
