//  Q. Count The total number of charcter in string

public class CountCharacter1 {

    public static void main(String[] args) {
        int count = 0 ;
        String x = "Hey Sid";

        // Count each Character except spaces

        for(int i = 0 ; i<x.length() ; i++){
            
            if(x.charAt(i) != ''){
                count++;
            }
        }

        // Display Character

        System.out.println(count);
    }
    
}
