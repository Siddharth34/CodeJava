import java.util.Scanner;

public class PrimeFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number");
        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.println("Prime No");
        }else{
            System.out.println("Not Prime No");
        }

    }

  public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        for(int i = 2; i < Math.sqrt(num) ; i++){
            if(i % num == 0){
                return false;
            }
        }
        
       return true;

        

    }

}
