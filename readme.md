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

_Multiple inheritance is not supported by Java_
