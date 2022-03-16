// Java Program for Method overloading
// By using Different Types of Arguments

class Methodoverloading{
    public static void main(String[] args){

        System.out.println(Operations.Add(20 , 25));
        System.out.println(Operations.Add(20 , 25));

    }
}


class Operations{
    static int Add(int a , int b){
        return a + b;
    }

    static double Add(double a , double b){
        return a + b;
    }
}