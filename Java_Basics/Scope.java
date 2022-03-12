public class Scope {
    public static void main(String[] args) {
       
        int a = 36;

        {
             a = 360;
             String name = "Siddharth";
        }

            a = 50;
             String  name = "Siddhart"; // initialised out of the box

               name = "Sid"; // Do not edit out of the box   

        
        System.out.println(name);
        System.out.println(a);

    }
}
