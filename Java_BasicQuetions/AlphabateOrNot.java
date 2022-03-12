// Q. Check first character is alphabate or not

public class AlphabateOrNot {
    public static void main(String[] args) {
        String name = "Siddharth";

        char ch = name.charAt(0);

        if(Character.isUpperCase(ch)){
            System.out.println("Character is in uppercase");
        }else{
            System.out.println("Character is in lowercase");
        }
    }
}
