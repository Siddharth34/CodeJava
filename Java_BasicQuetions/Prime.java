public class Prime {

    public static void main(String[] args) {
            int a = 7;
            boolean isPrime = true;


            for(int i = 2 ; i < a ; i++ ){
                
            if(a <= 1){
                isPrime = false;
            }
                if(a % i == 0){
                     isPrime = false;
                     break; // dont forgate break
                }
            }

            if(isPrime){
                System.out.println("Prime nu");
            }else{
                System.err.println("Not Prime nu");
            }
    
    }

}
