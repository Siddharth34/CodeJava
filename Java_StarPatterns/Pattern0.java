public class Pattern0{
    public static void main(String[] args) {
        int n = 4;

        for(int row = 1 ; row <= n ; row++){
            // For every row run the colum
            for(int col = 1 ; col <= row ; col++){
                System.out.print("* ");
            }
             // When one row is printed , we need to add a new line
        System.out.println();
        }
    }
}

// * 
// * *
// * * *
// * * * *
