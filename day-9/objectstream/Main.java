package objectstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Main {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    FileOutputStream fileOutputStream = new FileOutputStream("./day-9/objectstream/demo.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

    Student student = new Student("Rushan", 21);
    objectOutputStream.writeObject(student);
    fileOutputStream.close();
    objectOutputStream.close();

    FileInputStream fileInputStream = new FileInputStream("./day-9/objectstream/demo.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    Student readStudent = (Student) objectInputStream.readObject();
    readStudent.display();
    System.out.println();
    fileInputStream.close();
    objectInputStream.close();
  }
}
