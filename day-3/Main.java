class Main {
  public static void main(String[] args) {
    int a = 2, b = 2;
    System.out.println(a == b);

    String nameOne = new String("Rushan");
    String nameTwo = new String("Rushan");
    System.out.println(nameOne == nameTwo); // False
    System.out.println(nameOne.equals(nameTwo)); // True

    String lastNameOne = "Buyo";
    String lastNameTwo = "Buyo";
    System.out.println(lastNameOne == lastNameTwo);
  }
}
