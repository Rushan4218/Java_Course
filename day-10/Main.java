class Main {
  public static void main() throws UnderageException {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("Enter your age: ");
    scanner.close();
    int age = scanner.nextInt();
    if (age < 18) {
      throw new UnderageException("Underage! You can't vote.");
    }
  }
}
