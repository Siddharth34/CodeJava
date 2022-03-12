import java.util.Arrays;
import java.util.Scanner;

public class Arr1 {

    // Print arrays in for loop without repetation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[4];

        // arr[0] = 9;
        // arr[1] = 2;
        // arr[2] = 25;
        // arr[3] = 47;
        // arr[4] = 23;


        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}
