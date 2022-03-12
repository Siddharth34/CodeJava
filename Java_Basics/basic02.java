import java.util.Scanner;

// if salary is gretar than 10000 add 1000 other wise add 500

public class basic02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary");

        int salary = sc.nextInt();

        if(salary >= 10000){
            salary = salary + 1000;
        }else{
            salary = salary + 500;
        }

        System.out.println("Total salary = " + salary);
    }
    
}
