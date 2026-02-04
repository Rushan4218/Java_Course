package threading;

public class ThreadTwo extends Thread {

  Account account;

  public ThreadTwo(Account account) {
    this.account = account;
  }

  public void run() {
    account.withdraw(600);
  }
}
