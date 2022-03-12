import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun1("sid" , "ss" , "dlajkj");
        fun2(4, 5, "olo" , "lol");
    }

    static void fun2(int a , int b , String ...l){
       int ans = a + b;
        System.out.println(ans);
        System.out.println(Arrays.toString(l));
    }


    static void fun1(String ...k){
        System.out.println(Arrays.toString(k));
    }
}
