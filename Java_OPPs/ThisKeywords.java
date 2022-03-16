import java.util.*;

public class ThisKeywords {

    public static void main(String[] args) {

         // call with direct """class"""

         PersonsDetailsss p1 = new PersonsDetailsss( "Sid" , 21);
         PersonsDetailsss p2 = new PersonsDetailsss();
         PersonsDetailsss p3 = new PersonsDetailsss("Adarsh" , 22);

        // p1.name = "Siddharth";
        // p1.age = 20;

        p2.name = "Parvin";
        p2.age = 20;

        System.out.println(p1.name + " " + p1.age );
        System.out.println(p2.name + " " + p2.age );
        System.out.println(p3.name + " " + p3.age );

        // Calling Methods()
        p1.s1();
        p2.s1();
        p3.s1();


        // Static keyword is class Property not a objects Property Thats why call by using class name

        System.out.println(PersonsDetailsss.count);
        
    }
    
}

class PersonsDetailsss{
    String name;
    int age;

    // Createing Method()

    void s1(){
            System.out.println(name + " " + "Rocks");
    }


    // Static keyword is class Property not a objects Property

    static int count;

    // 'Default' Constructor is call every time when you call objects

    public PersonsDetailsss(){
        count++;
        System.out.println("Constructor");
    }

    
    // public PersonsDetailsss(){
    //     // count++;
    //     System.out.println("LoL");
    // }

        // constructors with parameters and call them with direct """class"""

    public PersonsDetailsss(String name , int age){

        // This keyword is use when call one constructer in anothers constructer
        // This keyword is  also use in call veriables

        this();
        this.name = name;
        this.age = age;
    }
}

/* Note -   Static keyword is class Property not a objects Property 
            public static void main(String[] args) is in also static keyword using name of file class */