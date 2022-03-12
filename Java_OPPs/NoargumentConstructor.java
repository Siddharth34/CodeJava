// Java Program to illustrate calling a
// no-argument constructor

class NoargumentConstructor{
    public static void main(String[] args){
        // this would invoke default constructor.
        Info s1 = new Info();

        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(s1.name);
    }
}

class Info{
    String name;
    int id;

    // this would be invoked while an object
    // of that class is created.
    Info (){
        System.out.println("Constructor called");
    }
} 