import java.util.*;

// ex 1221 , 535
// 1) Reverse the number

public class PalindromeNu {
    public static void main(String[] args) {
    // int nu = 444;
    Scanner sc = new Scanner(System.in);
System.out.println("Enter The no");
    int nu = sc.nextInt();
    int temp = nu;
    int rev = 0;
    int rem;

    while(temp != 0){
        rem = temp % 10; // 1 ,  2 
        rev = rev * 10 + rem; // process of rev
        temp = temp / 10; // 12 , 1
    }

    if(nu == rev){
        System.out.println("Palindrome Number");
    }else{
        System.out.println("Not Palindrome Number");
    }
    }
}
