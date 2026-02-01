import java.util.ArrayList;
import java.util.Collection;

class Main {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5 };
    for (int num : numbers) {
      System.out.println(num);
    }

    Collection<Integer> numberCollection = new ArrayList<Integer>();
    numberCollection.add(1);
    numberCollection.add(2);
    numberCollection.add(3);
  }
}
