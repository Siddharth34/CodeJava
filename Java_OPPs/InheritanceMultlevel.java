// Multilevel Inheritance

import java.util.*;

class Birds{

    void eat(){
        System.out.println("Eating");
    }

}

class Eagle extends Birds{

    void work(){
        System.out.println("Working");
    }

}

class babyEagle extends Eagle{

    void sleep(){
        System.out.println("Slepping");
    }
}


public class InheritanceMultlevel {

   public static void main(String[] args) {
    Eagle ls = new Eagle();

    ls.eat();
    ls.work();
      // ls.sleep(); its not posible becuase properties of child class is not allowed to parent class
   }
}
