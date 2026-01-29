// learning about classes and constructors 

class Student {
  String name;
  int age;

  // Constructor
  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void printInfo() {
    System.out.println("Student : " + this.name + ", Age: " + this.age);
  }
}

class Faculty {
  String name;
  int duration;

  public void setData(String name, int duration) {
    this.name = name;
    this.duration = duration;
  }

  public void printInfo() {
    System.out.println("Faculty: " + this.name + ", Duration: " + this.duration);
  }
}

public class Main {
  public static void main(String[] args) {
    // Creating objects
    Student rushan = new Student("Rushan", 21);
    Faculty csFaculty = new Faculty();
    csFaculty.setData("Computer Science", 4);

    // Printing info
    rushan.printInfo();
    csFaculty.printInfo();
  }
}
