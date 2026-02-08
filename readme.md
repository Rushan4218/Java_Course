## JAVA COURSE 

#### Day 1

**1. Installation**
[Visit This Site](https://jdk.java.net/25/)

- For Arch Linux based operating systems
```
sudo pacman -S jdk-openjdk
```

- For Ubuntu/Debian based OS
```
sudo apt update
sudo apt install openjdk-21-jdk # check list of available versions
```

- For Fedora
```
sudo dnf update 
sudo dnf install java-21-openjdk java-21-openjdk-devel
```

- For Windows
  - Download the installer and install
  - Set java path in environment

**2. Verify Installation**
Open any terminal
```
java -version
javac -version
```

**3. Running Java Program**
```
javac basic-1/Main.java # Compiles the program
java basic-1/Main # Runs the program
```


#### Day 2
_Yet to add content_
#### Day 3
_Yet to add content_

#### Day 4
_Yet to add content_

#### Day 5

###### Array 

**Basic Syntax**
```java
int[] numbers = {1, 2, 3, 4, 5};
int numbers[] = {1, 2, 3, 4, 5}
```

###### Collection
**Basic Syntax**
```java
Collection<datatype> identifier = new Collection<datatype>();
```
_Collection only supports object so if you use `int` you'll get an error._
```java
Collection<Integer> numbers = new Collection<int>();
```

###### Inheritance 

**Types of inheritance**
- **Simple**: One child class inherits from one parent class.
- **Hierarchical**: Multiple child classes inherits from one parent class.
- **Multi-Level**: A class inherits from a class which is already inherited from another class. 
- **Multiple**: A class inherits from more than one parent class.

_Multiple inheritance is not directly supported by Java_

###### Interface
Interface in java is a collection of abstract methods and constants. It is used to define a blueprint for any class that implements it.

**Characteristics of Interfaces:**

1. **Abstract**: An interface cannot be instantiated on its own.
2. **Must implement all methods**: Any class that implements an interface must provide an implementation for all the methods defined in the interface.
3. **Can only contain method signatures**: An interface can only declare abstract methods, constants, and static methods (from Java 8 onwards).
4. **No state**: Interfaces cannot have instance variables or any state.

Examples:

```java
public interface Animal {
  void eat();
  void sleep();

  int MAX_AGE = 25;
}

public class Dog implements Animal {
  @override
  public void eat() {
    System.out.println("The dog is eating.");
  }
  @override
  public void sleep() {
    System.out.println("The dog is sleeping.")
  }
}

```

###### Abstract Classes

#### Day 8
###### File handling (I/O stream)
- **Byte Stream**
  - OutputStream (Abstract) 
    - FileOutputStream
    - BufferOutputStream
  - InputStream (Abstract)
    - FileInputStream
    - BufferInputStream
- **Character Stream**
  - Writer 
    - FileWriter
    - BufferWriter
  - Reader
   - FileReader
   - BufferReader
- **Object Stream**
  - ObjectOutputStream
  - ObjectInputStream


#### Day 9
- Markable Interface 
