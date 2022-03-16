class StaticV{
    public static void main(String []args){

        Student s1 = new Student(360 , "Siddharth");
        Student s2 = new Student(45 , "Adarsh");
        //we can change the college of all objects by the single line of code  
        Student.CollegeName = "IIT Bomby";  

        s1.dispaly();
        s2.dispaly();
    }
}


class Student{
    int rollNo; //instance variable
    String name; //instance variable
    static String CollegeName = "SVM"; //static variable  

    //constructor
    Student(int r , String n){
        rollNo = r;
        name = n;     
    }
      //method to display the values
    void dispaly(){
     System.out.println(rollNo + " " + name + " " + CollegeName);
}
}