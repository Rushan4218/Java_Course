import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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

    // Byte Stream with Buffering
    // FileOutputStream fileOutputStream = new
    // FileOutputStream("./day-8/filehandling/demo.txt");
    // BufferedOutputStream bufferedOutputStream = new
    // BufferedOutputStream(fileOutputStream);
    // int something = 20;
    // bufferedOutputStream.write(something);
    // bufferedOutputStream.flush(); // Note: close() not needed for buffering
    // streams
    // bufferedOutputStream.close();
    //
    // FileInputStream fileInputStream = new
    // FileInputStream("./day-8/filehandling/demo.txt");
    // BufferedInputStream bufferedInputStream = new
    // BufferedInputStream(fileInputStream);
    // int somethingFromFile = bufferedInputStream.read();
    // System.out.println(somethingFromFile);
    // bufferedInputStream.close();

    // Character Srream
    // FileWriter fileWriter = new FileWriter("./day-8/filehandling/demo.txt");
    // fileWriter.write("Some text");
    // fileWriter.close();
    //
    // FileReader fileReader = new FileReader("./day-8/filehandling/demo.txt");
    // List<String> lines = fileReader.readAllLines();
    // System.out.println(lines);
    // fileReader.close();
    //
    // BufferedWriter and BufferedReader
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./day-8/filehandling/demo.txt"));
    bufferedWriter.write("Some Text");
    bufferedWriter.close();

    BufferedReader bufferedReader = new BufferedReader(new FileReader("./day-8/filehandling/demo.txt"));
    List<String> lines = new ArrayList<>();
    String line;
    while ((line = bufferedReader.readLine()) != null) {
      lines.add(line);
    }
    bufferedReader.close();
    System.out.println(lines);
  }
}
