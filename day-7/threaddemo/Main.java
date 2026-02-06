package threaddemo;

class Main {
  public static void main(String[] args) {

    Demo demo = new Demo();
    demo.start();

    ThreadDemo threadDemo = new ThreadDemo();
    Thread thread = new Thread(threadDemo);
    thread.start();
  }
}
