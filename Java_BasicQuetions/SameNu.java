import java.util.Scanner;

public class SameNu {
    public static void main(String[] args) {
        // int num = 12258;
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int numCount = sc.nextInt();

        
        int count = 0; 

        while(num > 0){
            int rem = num % 10; 

            if(rem == numCount){
                count ++;
            }
            num /= 10;
        }

        System.out.println(count);
    }
}
