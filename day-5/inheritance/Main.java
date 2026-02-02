package inheritance;

class Math {
  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }
}

class Calculator extends Math {
  public int multiply(int a, int b) {
    return a * b;
  }
}

class Main {
  public static void main(String[] args) {
    Calculator myCalc = new Calculator();
    int a = 30, b = 20;
    int sum = myCalc.add(30, 20);
    int difference = myCalc.subtract(30, 20);
    int product = myCalc.multiply(30, 20);

    System.out.println("The sum of " + a + " and " + b + "is: " + sum);
    System.out.println("The difference of " + a + " and " + b + "is: " + difference);
    System.out.println("The product of " + a + " and " + b + "is: " + product);
  }
}
