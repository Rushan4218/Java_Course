class Demo extends Thread {
  public void run() {
    for (int i = 51; i <= 100; i++) {
      System.out.println(i);
    }
  }
}
