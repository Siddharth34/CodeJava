class Encapsulations{
    	public static void main(String [] args) {

                Student obj = new Student();

                obj.setName("Siddharth");
                obj.setRollNo(360);

                System.out.println(obj.getName());
                System.out.println(obj.getRollNo());
        }
}

class Student{
    private String Name;
    private int RollNo;

    //Geters ANd setters Method

    public String getName(){
        return Name;
    }

    public int getRollNo(){
        return RollNo;
    }


    public void setName(String n){
         Name = n;
        // Name = "Sid";
    }

    public void setRollNo(int r){
       RollNo = r;
        // RollNo = 360  
    } 

    
}


        // Direct access of RollNo And Name is not possible
        // due to encapsulation
        // System.out.println(obj.Name) Or System.out.println(obj.RollNo)
        

