public class Shadowing {

   static int x = 56;
    public static void main(String[] args) {
        System.out.println(x); // 56

        int x ; // decleration
        // System.out.println(x); // value is not inisilized 
        x = 12; // inisiliazed
        System.out.println(x); // 90
        run();
    }

    static void run(){
        System.out.println(x); // 56
    }

}
