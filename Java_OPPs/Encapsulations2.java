import java.util.*;



public class Encapsulations2 {
    public static void main(String[] args) {

        laptop l1 = new laptop();
        l1.model = 55;
        // l1.price = 00;
        l1.setPrice(77);
        System.out.println(l1.getPrice());

    }
}

class laptop{

    private int price;
    int model;

    // Seters

    public void setPrice(int p){
        // is user isAdmin
        boolean isAdmin = true;
        if(!isAdmin){
            System.out.println("you are not admin");
        }else{
            this.price = p;
        }

             
    }
         // Geters

        public int getPrice(){
            return price;
        }

}
