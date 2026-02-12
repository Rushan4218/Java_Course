package encapsulation;

public class MyResult {
  private int obtainedMarks;

  public int getObtainedMarks() {
    return obtainedMarks;
  }

  public void setObtainedMarks(int obtainedMarks) {
    if (obtainedMarks < 0 || obtainedMarks > 100) {
      System.out.println("Invalid marks. Marks should be between 0 and 100.");
    } else {
      this.obtainedMarks = obtainedMarks;
    }
  }
}
