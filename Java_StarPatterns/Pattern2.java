public class Pattern2 {
    public static void main(String[] args) {

        int n = 4;

        for(int row = 1 ; row <= n ; row++){
           for(int col = n ; col >= row ; col-- ){
               System.out.print("* ");
           }
           System.out.println();
        }
    }
}

// (int col = 1 ; col <= n - row + 1  ; col++)  is also aplicable

// * * * *
// * * *
// * *
// * 