public class Pattern3 {
    public static void main(String[] args) {
        int n = 4;

        for(int row = 1 ; row <= n ; row++){
           for(int col = 1 ; col <= row ; col++ ){
               System.out.print(col + " ");
           }
           System.out.println();
        }
    }
}

// 1
// 1 2
// 1 2 3
// 1 2 3 4