package inheritance;

class MyMath {
  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }
}

class Calc extends MyMath {

}

class Main {
  public static void main(String[] args) {
    System.out.println();
  }

  Calc myCalc = new Calc();
  int a = 30, b = 20;
  int sum = myCalc.add(30, 20);
  int difference = myCalc.subtract(30, 20);
}
