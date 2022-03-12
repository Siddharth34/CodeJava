import java.util.ArrayList;
import java.util.Scanner;

public class ArrList2 {
    public static void main(String[] args) {

        ArrayList<Integer> list =  new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < 5 ; i++){
            list.add(sc.nextInt());
        }

        for(int i = 0 ; i < 5 ; i++){
            System.out.println(list.get(i));
            // pass index here list[index] syntax is not work here
        }



        System.out.println(list);


    }
}
