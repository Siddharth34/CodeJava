import java.util.Arrays;

public class PassingFun {
    public static void main(String[] args) {
        int [] arr = {5 , 4 , 9 , 90};

        System.out.println(Arrays.toString(arr));

        change(arr);

        System.out.println(Arrays.toString(arr));



    }

    static void change(int arr[]){
        arr[3] = 11; 
    }
}
