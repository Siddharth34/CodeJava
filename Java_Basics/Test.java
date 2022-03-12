public class Test {

    public static void main(String[] args) {

       int num = 153;
       int t1 = num;
       int length = 0;

       // find the lenth

       while(t1 != 0){
           t1 = t1 / 10; 
           length++;
       }

       int t2 = num;
       int arm = 0;

       while(t2 != 0){
          int rem = t2 % 10; // 3 5
          int mul = 1;
           for(int i = 1 ; i <= length; i++ ){
                mul = mul * rem;
           }
          arm = arm + mul;
           t2 = t2 / 10;
       }


       if(arm == num){
           System.out.println("yeyeye");
       }else{
           System.out.println("nooooo");
       }


}
}
