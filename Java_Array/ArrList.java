import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        
        list.size();
        System.out.println(list);

        list.add(44);
        list.add(74);
        list.add(46);
        list.add(14);
        System.out.println(list);

        // System.out.println(list.get(0));
        // System.out.println(list.size());
        list.remove(1);

        System.out.println(list);
    }
}
