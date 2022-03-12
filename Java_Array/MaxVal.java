public class MaxVal {
    public static void main(String[] args) {
        int [] arr = {22 , 44 , 45 , 88};

        System.out.println(max(arr));
    }

    static int max(int[] arr){

        int maxNu = arr[0];

        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] > maxNu){
                maxNu = arr[i];
            }
        }
        return maxNu;

    }

   
}
