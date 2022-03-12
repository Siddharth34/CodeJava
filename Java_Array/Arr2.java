import java.util.Arrays;
import java.util.Scanner;

public class Arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] arr = new String[6];

        // for(int i = 0 ; i < arr.length ; i++){
        //     arr[i] = sc.nextLine();
        // }

        for(String str : arr ){
            str = sc.nextLine();
            System.out.println(str);
        }

        System.out.println(Arrays.toString(arr));


        // Modify
        arr[0] = "Sid";

        System.out.println(Arrays.toString(arr));



    }
}
