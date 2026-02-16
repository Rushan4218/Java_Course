package overloading;

class Main {
  public static void main() {
    Calculator calculator = new Calculator();
    int sumOne = calculator.sum(1, 2);
    int sumTwo = calculator.sum(1, 2, 3);
    String sumThree = calculator.sum("Hello ", "World");
    System.out.println("Sum of 1 and 2: " + sumOne);
    System.out.println("Sum of 1, 2 and 3: " + sumTwo);
    System.out.println("Concatenation of 'Hello ' and 'World': " + sumThree);
  }
}
