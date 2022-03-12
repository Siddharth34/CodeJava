public class TwoDarr {
    public static void main(String[] args) {

        // 2D array mens by arrays in array
        // int [][] nums = new int [3][5];  // [row][colum] row is compulsory but colum is optional

        int [][] arr = {
            {1 , 2 , 5},
            {5 , 4 },
            {4 , 5 , 4 , 1}
        };

        int [][] arrs = new int[3][4]; 
        System.out.println(arr.length); // its give number of rows == 3

        System.out.println(arr);
        
    }
}
