package encapsulation;

class Main {
  public static void main(String[] args) {
    MyResult result = new MyResult();
    result.setObtainedMarks(200);
    System.out.println("Obtained Marks: " + result.getObtainedMarks());
    result.setObtainedMarks(90);
    System.out.println("Obtained Marks: " + result.getObtainedMarks());
  }
}
