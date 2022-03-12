import java.util.Scanner;

public class Function1 {
    public static void main(String[] args) {
      int ans = sum(); // also strored in that perticular return type (int)
      System.out.println(ans);
    }

    // return the value 
    // in this return type is (int)

    static int sum(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First no.");
        int num1 = sc.nextInt();
        System.out.println("Enter The secound no.");
        int num2 = sc.nextInt();
        
        int sum = num1 + num2;

        return sum;
        // when ever return hits its meanes khatam

    }
}
