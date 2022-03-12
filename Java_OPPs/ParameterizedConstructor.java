// Java Program to Illustrate Working of
// Parameterized Constructor

class ParameterizedConstructor{
     public static void main(String[] args){
         
        // This would invoke the parameterized constructor.
         OfficeInfo emp = new OfficeInfo();

              System.out.println(emp.id);
     }
}

class OfficeInfo{
    // data members of the class.   
    String name;
    int id;

    
    OfficeInfo(){

        this.name = "Siddharth";
        this.id = 360;

    }
}