import java.util.Scanner;

public class Amsotrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nu");
        int num=sc.nextInt();

        int t1=num;
        int length=0;

        while(t1 != 0){
            t1 = t1 / 10; 
            length++;
        }

        int t2=num;
        int arm=0;

        while(t2 !=0){
            int rem = t2%10;
            int mul =1;
            for(int i=1; i<=length; i++){
            mul=mul*rem;
            }
            t2 = t2/10;
            arm= arm+mul;
        }
        if(arm==num){
            System.out.println("yesssssssss");
        }else{
            System.out.println("nOoooooo");
        }

    }
}
