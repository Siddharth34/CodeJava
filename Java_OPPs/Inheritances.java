// Single Inheritance

import java.util.*;

class emp{
    int salary = 500000;
}

class Inheritances extends emp{

    int bonus = 100000;


    public static void main(String[] args) {

        Inheritances s = new Inheritances();

        System.out.println(s.salary);
        System.out.println(s.bonus);         
    }
}

// Note : class emp is also defined in other file and then extands

// How to run Programm ===

// After you compile the code using the command:
// javac fileName.java
// Run the java .class file by only specifying fileName without the .java extension
// java fileName

// if you use fileName.java it won't run the specific .
// class file; it will try to interpret the .java file. if you want to interpret a
// java file then parent class must contain the main(String[]) method.