import java.util.*;

// Hierarchical Inheritance


class emps{

    void work(){
        System.out.println("Working");
    }
}

class Hr extends emps{
    void hrWork(){
        System.out.println("hrWork");
    }
}

class developer extends emps{
    void developerWork(){
        System.out.println("developerWork");
    }
}

public class InheritancesHierachical {

    public static void main(String[] args) {
        
        developer ls = new developer();

        ls.developerWork();
        ls.work();
        // ls.hrWork(); C.T.Error 

    }
    
}

