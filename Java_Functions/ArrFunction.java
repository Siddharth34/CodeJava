import java.util.Arrays;

public class ArrFunction {
    public static void main(String[] args) {

        int[] nums = {44 , 55 , 88 , 44};

        System.out.println(Arrays.toString(nums));
        changeArr(nums);
        System.out.println(Arrays.toString(nums));
        
    }

    static void changeArr(int[] arr){
        arr[0] = 360;
    }
}

// Note :- 1) arr == num
