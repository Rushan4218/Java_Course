import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
  public static void main() throws IOException {

    // Byte Stream
    // FileOutputStream fileOutputStream = new
    // FileOutputStream("./day-8/filehandling/demo.txt");
    // int something = 20;
    // fileOutputStream.write(something);
    // fileOutputStream.close();
    //
    // FileInputStream fileInputStream = new
    // FileInputStream("./day-8/filehandling/demo.txt");
    // int somethingFromFile = fileInputStream.read();
    // System.out.println(somethingFromFile);
    // fileInputStream.close();

    // Character Srream
    FileWriter fileWriter = new FileWriter("./day-8/filehandling/demo.txt");
    fileWriter.write("Some text");
    fileWriter.close();

    FileReader fileReader = new FileReader("./day-8/filehandling/demo.txt");
    List<String> lines = fileReader.readAllLines();
    System.out.println(lines);
    fileReader.close();
  }
}
