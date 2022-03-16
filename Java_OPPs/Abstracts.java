import java.util.*;

public class Abstracts {
    public static void main(String[] args) {
        
        Audi a1 = new Audi();

        a1.price = 55;

        a1.start();
    }
}

class BMW extends car{

    @Override
    void start() {
        System.out.println("BMW is staring");
    }

}

class Audi extends car{

    @Override
    void start() {
       System.out.println("Audi is staring"); 
    }
    
}

 abstract class car{

  int  price = 44;

  abstract void start();
     
}
