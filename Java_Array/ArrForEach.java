import java.util.Arrays;
import java.util.Scanner;

public class ArrForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int nums = sc.nextInt();

        int [] arr = new int[5];
        for(int nums : arr){ // for every elemement of arry , print the elemnt
            nums = sc.nextInt(); // here num reprensent element of the array
            System.out.println(nums);
        }

        // Also a shortcut 
        // System.out.println(Arrays.toString(arr));

    }
}
