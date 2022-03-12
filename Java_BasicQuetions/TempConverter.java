import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Celsius");

        float Celsius = sc.nextFloat();

        float Fah = (Celsius * 9/5) + 32;

        System.out.println("Fahrenheit = " + Fah);


    }
}
