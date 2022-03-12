// Java Program to Illustrate Working of
// Parameterized Constructor

class ParameterizedConstructor1{
     public static void main(String[] args){
         
        // This would invoke the parameterized constructor.
         OfficeInfo emp = new OfficeInfo("Siddharth Pratapsinh Chavan" , 360);

            System.out.println(emp.name);
            System.out.println(emp.id);
            
     }
}

class OfficeInfo{
    // data members of the class.   
    String name;
    int id;

    // Constructor would initialize data members
    // With the values of passed arguments while
    // Object of that class created
    OfficeInfo(String fullname , int empId){
        this.name = fullname;
        this.id = empId;
    }
}