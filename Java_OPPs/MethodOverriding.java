// Java Program for Method Overriding

class MethodOverriding{
     public static void main(String[] args){

       Parent s = new subClass1();
       Parent x = new subClass2();

       s.print();
       x.print();


    }
}

class Parent{
    void print(){
        System.out.println("I Am Parent class");
    }
}

@Override
class subClass1 extends Parent{
    void print(){
        System.out.println("I Am subClass1 class");
    }
}

@Override
class subClass2 extends Parent{
    void print(){
        System.out.println("I Am subClass2 class");
    }
}