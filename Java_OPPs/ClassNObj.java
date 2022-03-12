public class ClassNObj {
    public static void main(String[] args) {

        Student s1 = new Student(); // Creating new object of class
       
        s1.name = "Siddharth";
        s1.rNo = 4218;
        s1.marks = 79.30f;

        System.out.println(s1.name);
        System.out.println(s1.rNo);
        System.out.println(s1.marks);
        
    }
}

// Create a New class

class Student{
    int rNo;
    String name;
    float marks;
}

//  Note - Also add two or more objects Refer ClassNObj1.java


