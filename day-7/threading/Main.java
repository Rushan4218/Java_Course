package threading;

public class Main {
  public static void main() {
    Account account = new Account();
    ThreadOne threadOne = new ThreadOne(account);
    ThreadTwo threadTwo = new ThreadTwo(account);
    threadOne.start();
    threadTwo.start();
  }
}
