public class MaxVal2 {
    public static void main(String[] args) {
        int [] arr = {22 , 44 , 45 , 88 , 99 , 65};

        System.out.println(MaxRange(arr, 3, 5));


    }

    static int MaxRange(int [] arr , int start ,int end){
        int Maxnu = arr[start];
        
        for(int i = start ; i <= end; i++ ){
            if(arr[i] > Maxnu){
                Maxnu = arr[i];
            }
        }

        return Maxnu;
    }
}
