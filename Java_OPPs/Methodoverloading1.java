// Java Program for Method overloading
// by Using Different Numbers of Arguments

class Methodoverloading1{
    public static void main(String[] args){

        System.out.println(Operations.Add(20 , 25));
        System.out.println(Operations.Add(20 , 25 , 5));

    }
}


class Operations{
    static int Add(int a , int b){
        return a + b;
    }

    static int Add(int a , int b , int c ){
        return a + b + c;
    }
}

// Note : If Same Number of Arguments Are created
//  .\Methodoverloading1.java:19: error: method Add(int,int) is already defined in class Operations
// static int Add(int a , int b)