import java.util.Arrays;
import java.util.Scanner;

public class TwoDarrInput {

    public static void main(String[] args) {
        // int [][] arrs = new int[3][4]; 
        // System.out.println(arr.length); // its give number of rows == 3

        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];

        // input

        for(int row = 0 ; row < arr.length ; row++){
            // for each colum in every row

            for(int colum = 0 ; colum < arr[row].length ; colum++){
                arr[row][colum] = sc.nextInt();
            }
        }

        // output

        // for(int row = 0 ; row < arr.length ; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
    
}
