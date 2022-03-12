public class Scope {
    public static void main(String[] args) {
        int x = 90;
        int y = 10;

        {
            // int x = 9; // variable x is already defined in method main
            x = 9;  // but you can change the value in block ({})

            int a = 200; 
            System.out.println(a);

            // value initialised in the block , will remain in block
        }

        System.out.println(x);
        // System.out.println(a); // can not use outside of the block
    }

    
}
