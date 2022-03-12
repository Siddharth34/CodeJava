import java.util.Scanner;

// Q. Find the largest of the 3 numbers ?

public class FindLargNu {
    public static void main(String[] args) {
        // int a = 55;
        // int b = 5;
        // int c = 66;

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // if(a>b && a>c){
        //     System.out.println("a is largest num");
        // }else if(b>a && b>c){
        //     System.out.println("b is largest num");
        // }else{
        //     System.out.println("c is largest num");
        // }

        int MAX = a;

        if(b > MAX){
            MAX = b;
        }else if(c > MAX){
            MAX = c;
        }

        System.out.println(MAX);
    }
}
